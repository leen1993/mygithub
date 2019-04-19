package com.een.cn.create;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;

import com.een.cn.pojo.DbInfo;
import com.een.cn.pojo.Field;
import com.een.cn.pojo.ForeginKey;
import com.een.cn.pojo.Pojo;
import com.een.cn.pojo.Table;
import com.een.cn.util.ArrayUtil;
import com.een.cn.util.ConfigUtil;

@Component
public class CreateDbinfo extends CommonCreate {

	public void create(List<Pojo> pojos, DbInfo dbinfo) throws IOException {

		// 主逻辑 替换标识符号
		mainLogic(pojos, dbinfo);
	}

	/**
	 * 替换逻辑
	 * 
	 * @param pojos
	 * @param dbinfo
	 * @throws IOException
	 */
	public void mainLogic(List<Pojo> pojos, DbInfo dbinfo) throws IOException {
		
		String readFileToString = FileUtils.readFileToString(new File(ConfigUtil.get("model.dbinfoHtml")));
		StringBuffer sb = null;
		sb = new StringBuffer(readFileToString);

		// 数据库大略信息
		sb.append("<p></p>");
		sb.append("<table>");
		sb.append("<tr>");
		sb.append("<td>");
		sb.append("项");
		sb.append("</td>");
		sb.append("<td>");
		sb.append("值");
		sb.append("</td>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<td>");
		sb.append("数据库名");
		sb.append("</td>");
		sb.append("<td>");
		sb.append(dbinfo.getDbName());
		sb.append("</td>");
		sb.append("</tr>");
		sb.append("<tr>");
		sb.append("<td>");
		sb.append("表数量");
		sb.append("</td>");
		sb.append("<td>");
		sb.append(dbinfo.getTableNum());
		sb.append("</td>");
		sb.append("</tr>");
		sb.append("</table");

		// 数据库表信息
		sb.append("<p></p>");
		sb.append("<table>");
		sb.append("<tr>");
		sb.append("<td>");
		sb.append("序号");
		sb.append("</td>");
		sb.append("<td>");
		sb.append("表名");
		sb.append("</td>");
		sb.append("<td>");
		sb.append("注释");
		sb.append("</td>");
		sb.append("<td>");
		sb.append("字段数");
		sb.append("</td>");
		sb.append("<td>");
		sb.append("数据量");
		sb.append("</td>");
		sb.append("<td>");
		sb.append("主键");
		sb.append("</td>");
		sb.append("<td>");
		sb.append("外键");
		sb.append("</td>");
		sb.append("</tr>");
		int num = 1;
		for (Table table : dbinfo.getTables()) {
			sb.append("<tr>");
			sb.append("<td>");
			sb.append(num++);
			sb.append("</td>");
			sb.append("<td>");
			sb.append("<a href=\"#"+table.getTableName()+"\">");
			sb.append(table.getTableName());
			sb.append("</a>");
			
			sb.append("</td>");
			sb.append("<td>");
			sb.append(table.getTableComment());
			sb.append("</td>");
			sb.append("<td>");
			sb.append(table.getFieldNum());
			sb.append("</td>");
			sb.append("<td>");
			sb.append(table.getDataNum());
			sb.append("</td>");
			sb.append("<td>");
			// 主键
			for (Field field : table.getPrimaryKeys()) {
				sb.append(field.getName() + ",</br>");
			}

			sb.append("</td>");
			sb.append("<td>");
			// 外键
			for (ForeginKey foreginKey : table.getForeignKeys()) {
				sb.append("<a href=\"#"+foreginKey.getPktableName()+"\">");
				sb.append(foreginKey.getPktableName());
				sb.append("</a>");
				sb.append("." + foreginKey.getPkcolumnName() + " = ");
				
				sb.append("<a href=\"#"+foreginKey.getFktableName()+"\">");
				sb.append(foreginKey.getFktableName());
				sb.append("</a>");
				sb.append( "." + foreginKey.getFkcolumnName() + ",</br>");
			}
			sb.append("</td>");
			sb.append("</tr>");
		}
		sb.append("</table>");

		// 主要数据表内容
		for (int i = 0; i < pojos.size(); i++) {
			Pojo pojo = pojos.get(i);
			/*
			 * <p>表名</p> <table>
			 * <tr><td>字段名</td><td>注释</td><td>字段类型</td><td>是否主键</td><td>长度</td><
			 * td>非空</td></tr>
			 * <tr><td>字段名</td><td>注释</td><td>字段类型</td><td>是否主键</td><td>长度</td><
			 * td>非空</td></tr> </table>
			 */
			sb.append("<p><a name=\""+pojo.getTableName()+"\" href=\"http://localhost:8080/"); 
			sb.append(pojo.getDbName() + "/");
			sb.append(setUrl(pojo) + "/view.do\" target=\"_Blank\">");
			sb.append(pojo.getTableName());
			sb.append("</a>【");
			sb.append(pojo.getTableComment());
			sb.append("】");
			sb.append("</p>");
			sb.append("<table>");

			sb.append("<tr>");
			sb.append("<td>");
			sb.append("序号");
			sb.append("</td>");
			sb.append("<td>");
			sb.append("字段名");
			sb.append("</td>");
			sb.append("<td>");
			sb.append("字段类型");
			sb.append("</td>");
			sb.append("<td>");
			sb.append("是否主键");
			sb.append("</td>");
			sb.append("<td>");
			sb.append("长度");
			sb.append("</td>");
			sb.append("<td>");
			sb.append("注释");
			sb.append("</td>");
			sb.append("<td>");
			sb.append("外键关联");
			sb.append("</td>");
			sb.append("</tr>");
            num = 0;
			for (Field field : pojo.getFieldList()) {
				sb.append("<tr>");
				sb.append("<td>");
				sb.append(++num);
				sb.append("</td>");
				sb.append("<td>");
				sb.append(field.getDbField());
				sb.append("</td>");
				sb.append("<td>");
				sb.append(field.getJdbcType());
				sb.append("</td>");
				sb.append("<td>");
				sb.append(field.isPrimaryKey());
				sb.append("</td>");
				sb.append("<td>");
				sb.append(field.getLength());
				sb.append("</td>");
				sb.append("<td>");
				sb.append(field.getAnnotation());
				sb.append("</td>");
				sb.append("<td>");
				if (field.getForeginKeys() != null) {
					for (ForeginKey fk : field.getForeginKeys()) {
						sb.append("<a href=\"#"+fk.getPktableName()+"\">");
						sb.append(fk.getPktableName());
						sb.append("</a>");
						sb.append("." + fk.getPkcolumnName() + "</br>");
						
					}
				}
				sb.append("</td>");
				sb.append("</tr>");
			}
			sb.append("</table>");
		}

		sb = replace(sb, FinalVariable.DB_NAME, pojos.get(0).getDbName());
		sb.append("</body></html>");
		
		
		String fileName = sb.substring("<!--".length(), sb.indexOf("-->", 4));
		
		FileUtils.writeStringToFile(new File(fileName),	sb.toString());
	}

	private String setUrl(Pojo pojo) {
		String[] s = pojo.getTableName().split("_");
		return ArrayUtil.join(s, "/");
	}

	/**
	 * 替换方法替换所有标识符
	 * 
	 * @param sb
	 *            替换的字符串
	 * @param replaceStr
	 *            标识符
	 * @param newStr
	 *            替换为
	 * @return
	 */
	private StringBuffer replace(StringBuffer sb, String replaceStr, String newStr) {
		int packageNameStart = 1;
		int packageNameEnd = 0;
		while (true) {
			packageNameStart = sb.indexOf(replaceStr, packageNameEnd);
			if (packageNameStart == -1)
				break;
			packageNameEnd = packageNameStart + replaceStr.length();
			sb = sb.replace(packageNameStart, packageNameEnd, newStr);
		}
		return sb;
	}

	/**
	 * 设置专门属性
	 * 
	 */
	public void setOwnData(List<Pojo> pojos) {
		// setFileName();
		// setFilePath();
	}
}
