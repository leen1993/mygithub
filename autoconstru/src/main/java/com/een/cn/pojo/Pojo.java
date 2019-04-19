package com.een.cn.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 实体类的属性
 * 
 * @author leen_pc
 *
 */
public class Pojo implements Cloneable{
  
	private String packageName;
	
	private String parentPackage;
	
	private List<String> importClasses;
	
	private String pojoName;
		
	/**全名*/
	private String fullName;
	
	private String fileName;
	
	private String filePath;
	
	private List<Field> fieldList;

	private List<Field> primaryKeys;
	
	private List<ForeginKey> fkList;
	
    private boolean havaToString;
    
    private boolean havaHashCode;
    
    private boolean havaEquals;
    
	private String modelName;
	
	private String createDate;
	
	private String author;
	
	/**
	 * dbName
	 */
	private String dbName;
	
	/**
	 * 表名
	 */
	private String tableName;
	
	/**注释内容*/
	private String tableComment;
    
    public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
    
    public Pojo() {
    	
    }

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public List<String> getImportClasses() {
		return importClasses;
	}

	public void setImportClasses(List<String> importClasses) {
		this.importClasses = importClasses;
	}

	public String getPojoName() {
		return pojoName;
	}

	public void setPojoName(String pojoName) {
		this.pojoName = pojoName;
	}

	public List<Field> getFieldList() {
		return fieldList;
	}

	public void setFieldList(List<Field> fieldList) {
		this.fieldList = fieldList;
	}

	public boolean isHavaToString() {
		return havaToString;
	}

	public void setHavaToString(boolean havaToString) {
		this.havaToString = havaToString;
	}

	public boolean isHavaHashCode() {
		return havaHashCode;
	}

	public void setHavaHashCode(boolean havaHashCode) {
		this.havaHashCode = havaHashCode;
	}

	public boolean isHavaEquals() {
		return havaEquals;
	}

	public void setHavaEquals(boolean havaEquals) {
		this.havaEquals = havaEquals;
	}

	public String getTableComment() {
		return tableComment;
	}

	public void setTableComment(String tableComment) {
		this.tableComment = tableComment;
	}


	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getCreateDate() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public List<Field> getPrimaryKeys() {
		return primaryKeys;
	}

	public void setPrimaryKeys(List<Field> primaryKeys) {
		this.primaryKeys = primaryKeys;
	}
    
	/**
	 * 重写Object的clone方法， 实现复制
	 */
	@Override  
    public Object clone() {  
        Pojo pojo = null;  
        try{  
            pojo = (Pojo)super.clone();  
        }catch(CloneNotSupportedException e) {  
            e.printStackTrace();  
        }  
        return pojo;  
    }

	public String getParentPackage() {
		return parentPackage;
	}

	public void setParentPackage(String parentPackage) {
		this.parentPackage = parentPackage;
	}

	public List<ForeginKey> getFkList() {
		return fkList;
	}

	public void setFkList(List<ForeginKey> fkList) {
		this.fkList = fkList;
	}

}
