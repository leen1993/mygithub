package com.een.cn;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.PathResource;
import org.springframework.jdbc.core.JdbcTemplate;

import com.een.cn.util.AppUtil;
import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 配置文件
 * 
 * @author leen_pc
 *
 */
@ComponentScan("com.een.cn")
@PropertySource(value="classpath:db.properties")
@Configuration
public class AppConfig {
	
	@Value(value="${db.user}")
	private String username;
	
	@Value(value="${db.password}")
	private String password;
	
	@Value(value="${db.url}")
	private String url;
	
	@Value(value="${db.driverClass}")
	private String driverName;
	
	@Value(value="${db.type}")
	private String dbType;

	/**
	 * 
	 * @return
	 * @throws PropertyVetoException
	 */
	@Bean
    public DataSource dataSource() throws PropertyVetoException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setUser(username);
		dataSource.setPassword(password);
		dataSource.setJdbcUrl(url);
		dataSource.setDriverClass(driverName);
		return dataSource;	
    }
	
	/**
	 * jdbcTemplate
	 * 
	 * @return
	 * @throws PropertyVetoException
	 */
	@Bean
	public JdbcTemplate jdbcTemplate() throws PropertyVetoException{
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());
		return jdbcTemplate;
	}
    
	/**
	 * 载入AppUtil到ioc容器中
	 * 
	 * @return
	 */
	@Bean
	public AppUtil appUtil(){
		return new AppUtil();
	}
	
	/**
	 * 资源文件载入
	 * 
	 * @return
	 */
	@Bean
	public PropertiesFactoryBean configproperties() {
		PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
		PathResource pathResource = new PathResource("src/main/resources/app.properties");
		PathResource pathResource1 = new PathResource("src/main/resources/db.properties");
		propertiesFactoryBean.setLocations(pathResource, pathResource1);
		return propertiesFactoryBean;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDbType() {
		return dbType;
	}

	public void setDbType(String dbType) {
		this.dbType = dbType;
	}
	
}
