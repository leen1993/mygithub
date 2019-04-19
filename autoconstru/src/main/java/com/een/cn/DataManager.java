package com.een.cn;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.jdbc.support.rowset.SqlRowSetMetaData;
import org.springframework.stereotype.Component;

import com.een.cn.create.CreateAppConfig;
import com.een.cn.create.CreateController;
import com.een.cn.create.CreateDao;
import com.een.cn.create.CreateDbinfo;
import com.een.cn.create.CreateJsp;
import com.een.cn.create.CreatePojo;
import com.een.cn.create.CreateService;
import com.een.cn.create.CreateXml;
import com.een.cn.pojo.DbInfo;
import com.een.cn.pojo.Field;
import com.een.cn.pojo.ForeginKey;
import com.een.cn.pojo.Pojo;
import com.een.cn.pojo.Table;
import com.een.cn.util.ConfigUtil;
import com.een.cn.util.PojoUtil;
import com.een.cn.util.StringUtil;
import com.een.cn.util.TypeConvert;

@PropertySource("classpath:app.properties")
@Component("dataManager")
public class DataManager {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private CreatePojo createPojo;

	@Autowired
	private CreateXml createXml;

	@Autowired
	private CreateDao createDao;

	@Autowired
	private CreateService createService;

	@Autowired
	private CreateController createController;

	@Autowired
	private CreateJsp createJsp;

	@Autowired
	private CreateDbinfo createDbinfo;
    
	@Autowired
	private CreateAppConfig createAppConfig;
	
	// 数据库信息
	private DbInfo dbinfo;

	/**
	 * 执行所有方法
	 * 
	 * @throws SQLException
	 * @throws IOException
	 * 
	 */
	public void execute() throws SQLException, IOException {
		// 初始化数据库数据
		List<Pojo> pojos = getData();

		// 设置pojo公共属性
		setCommonData(pojos);

		// 生成数据库表信息
		createDbinfo.create(pojos, dbinfo);

		 // 为实体类生成做pojo设置属性并生成
		 List<Pojo> pojoList = PojoUtil.copyList(pojos);
		 createPojo.create(pojoList);
		
		 // 生成xml文件
		 List<Pojo> xmlPojos = PojoUtil.copyList(pojoList);
		 createXml.create(xmlPojos);
		
		 // 生成dao文件
		 List<Pojo> daoPojos = PojoUtil.copyList(pojoList);
		 createDao.create(daoPojos);
		
		 // 生成service文件
		 List<Pojo> servicePojos = PojoUtil.copyList(pojoList);
		 createService.create(servicePojos);
		
		 // 生成controller层文件
		 List<Pojo> controllerPojos = PojoUtil.copyList(pojoList);
		 createController.create(controllerPojos);
		
		 // 生成jsp文件
		 List<Pojo> jspPojos = PojoUtil.copyList(pojoList);
		 createJsp.create(jspPojos);
		 
		 // 修改模板工程配置文件 app.properties
		 createAppConfig.create();
	}

	/**
	 * 构建实体Dbinfo
	 * 
	 * @param pojos
	 * @throws SQLException
	 */
	private void createDBinfo(List<Pojo> pojos, Connection conn) throws SQLException {
		DbInfo dbinfo = new DbInfo();

		int tableNum = 0;
		List<Table> tables = new ArrayList<Table>();
		Table table = null;
		for (Pojo p : pojos) {
			table = new Table();
			table.setTableName(p.getTableName());
			table.setTableComment(p.getTableComment());
			table.setFieldNum(p.getFieldList().size());
			table.setPrimaryKeys(p.getPrimaryKeys());
			table.setForeignKeys(p.getFkList());
			// 在这里设置数据表的其他值
			setTableNum(table, conn);
			table.setPojo(p);
			tables.add(table);
			tableNum++;
		}
		dbinfo.setTables(tables);
		dbinfo.setTableNum(tableNum);
		dbinfo.setDbName(pojos.get(0).getDbName());
		this.dbinfo = dbinfo;
	}

	/**
	 * 设置数据表数据量
	 * 
	 * @param pojo
	 * @param conn
	 */
	private void setTableNum(Table table, Connection conn) throws SQLException {
		String sql = "SELECT count(0) dataCount FROM " + table.getTableName();
		PreparedStatement pStemt = conn.prepareStatement(sql);
		ResultSet rs = pStemt.executeQuery();
		while (rs.next()) {
			table.setDataNum(rs.getInt("dataCount"));
		}
	}

	/**
	 * 从数据库获取数据表信息并包装成pojo
	 * 
	 * @return
	 * @throws SQLException
	 */
	private List<Pojo> getData() throws SQLException {
		List<Pojo> pojoList = new ArrayList<Pojo>();
		Connection connection = dataSource.getConnection();
		DatabaseMetaData metaData = connection.getMetaData();

		String dbName = connection.getCatalog();
		ResultSet tables = metaData.getTables(dbName, ConfigUtil.get("db.user"), null, new String[] { "TABLE" });
		while (tables.next()) {
			Pojo pojo = new Pojo();
			String tableName = tables.getString("TABLE_NAME");
			String sql = "select * from " + tableName;
			SqlRowSet queryForRowSet = jdbcTemplate.queryForRowSet(sql);
			SqlRowSetMetaData metaData2 = queryForRowSet.getMetaData();

			// 设置field
			ResultSet primaryKeys = metaData.getPrimaryKeys(dbName, ConfigUtil.get("db.user"), tableName);
			List<Field> primaryFields = new ArrayList<Field>();
			List<Field> fieldList = new ArrayList<Field>();
			setFieldValue(metaData2, primaryKeys, primaryFields, fieldList); // 不查数据库
			setFieldValue(connection, tableName, fieldList); // 查数据库
			pojo.setPrimaryKeys(primaryFields);
			pojo.setFieldList(fieldList);

			// 获取外键
			setForeginKeys(pojo, metaData, tableName);

			// 设置其他的pojo属性
			pojo.setPojoName(StringUtil.makeFirstLetterUpperCase(StringUtil.lineToHump(tableName)));
			pojo.setFileName(pojo.getPojoName());
			pojo.setTableName(tableName);
			pojo.setDbName(dbName);

			// 查询当前数据表的表注释
			setTableComment(pojo, connection);
			pojoList.add(pojo);
		}

		// 根据pojo设置 Table属性
		createDBinfo(pojoList, connection);

		connection.close();
		return pojoList;
	}

	/**
	 * 设置外键
	 * 
	 * @param pojo
	 * @param metaData
	 * @param tableName
	 * @throws SQLException
	 */
	protected void setForeginKeys(Pojo pojo, DatabaseMetaData metaData, String tableName) throws SQLException {
		List<ForeginKey> fkList = new ArrayList<ForeginKey>();
		ResultSet fks = metaData.getImportedKeys(null, null, tableName);
		ResultSetMetaData fkmd = fks.getMetaData();
		while (fks.next()) {
			ForeginKey fk = new ForeginKey();
			fk.setFkName(fks.getString("FK_NAME"));
			fk.setPktableName(fks.getString("PKTABLE_NAME"));
			fk.setPkcolumnName(fks.getString("PKCOLUMN_NAME"));
			fk.setFktableName(fks.getString("FKTABLE_NAME"));
			fk.setFkcolumnName(fks.getString("FKCOLUMN_NAME"));
			fkList.add(fk);
		}

		pojo.setFkList(fkList);
		if (fkList.size() > 0) {
			for (Field field : pojo.getFieldList()) {
				List<ForeginKey> list = new ArrayList<ForeginKey>();
				for (ForeginKey fk : fkList) {
					if(field.getDbField().equals(fk.getFkcolumnName())) {
					    list.add(fk);
					};
				}
				field.setForeginKeys(list);
			}
		}

	}

	/**
	 * 设置表注释
	 * 
	 * @param pojo
	 * @param conn
	 * @throws SQLException
	 */
	private void setTableComment(Pojo pojo, Connection conn) throws SQLException {
		String sql = "SELECT table_schema, table_name, table_comment FROM information_schema.TABLES WHERE table_name = '"
				+ pojo.getTableName() + "' AND table_schema = '" + pojo.getDbName() + "'";
		PreparedStatement pStemt = conn.prepareStatement(sql);
		ResultSet rs = pStemt.executeQuery();
		while (rs.next()) {
			pojo.setTableComment(rs.getString("table_comment"));
		}
	}

	/**
	 * 设置字段属性
	 * 
	 * @param connection
	 * @param tableName
	 * @param fieldList
	 * @throws SQLException
	 */
	private void setFieldValue(Connection conn, String tableName, List<Field> fieldList) throws SQLException {
		// 获取注释
		PreparedStatement pStemt = conn.prepareStatement("select * from " + tableName);
		ResultSet rs = pStemt.executeQuery("show full columns from " + tableName);
		Field currentField = null;
		while (rs.next()) {
			currentField = fieldList.get(rs.getRow() - 1);
			currentField.setAnnotation(rs.getString("Comment"));
			currentField.setRequired(rs.getString("Null").equals("NO"));
		}
	}

	/**
	 * 设置field的属性等
	 * 
	 * @param connection
	 *            数据库链接
	 * @param metaData2
	 * @param primaryKeys
	 * @param primaryFields
	 * @param fieldList
	 * @throws SQLException
	 */
	protected void setFieldValue(SqlRowSetMetaData metaData2, ResultSet primaryKeys, List<Field> primaryFields,
			List<Field> fieldList) throws SQLException {
		int columnCount = metaData2.getColumnCount();

		for (int i = 1; i <= columnCount; i++) {
			Field field = new Field();
			// 是否使用驼峰命名
			field.setDbField(metaData2.getColumnName(i));

			// 先作字段判断，是否为特殊保留字
			String fieldName = PojoUtil.isHoldWord(metaData2.getColumnName(i));

			// 是否驼峰命名
			if (ConfigUtil.getBoolean("lineToHump")) {
				field.setName(StringUtil.lineToHump(fieldName));
			} else {
				field.setName(fieldName);
			}

			field.setType(TypeConvert.javaTypeConvert(metaData2.getColumnClassName(i)));
			field.setJdbcType(TypeConvert.jdbcTypeConvert(metaData2.getColumnTypeName(i)));
			field.setLength(metaData2.getColumnDisplaySize(i));
			field.setAnnotation(metaData2.getColumnLabel(i));

			// 给pojo和field设置主键值
			while (primaryKeys.next()) {
				if (field.getDbField().equals(primaryKeys.getString("COLUMN_NAME"))) {
					primaryFields.add(field);
					field.setPrimaryKey(true);
				}
				;
			}

			fieldList.add(field);
		}
	}

	/**
	 * 给pojo设置其他的公共属性
	 * 
	 * @param pojos
	 */
	private void setCommonData(List<Pojo> pojos) {
		for (Pojo p : pojos) {
			p.setHavaEquals(false);
			p.setHavaHashCode(false);
			p.setHavaToString(false);
			p.setImportClasses(new ArrayList<String>());
			p.setModelName(null);
			p.setAuthor(ConfigUtil.get("author"));
		}
	}

}
