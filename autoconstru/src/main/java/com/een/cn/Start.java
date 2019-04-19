package com.een.cn;

import java.io.IOException;
import java.sql.SQLException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Start {
    
	public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        DataManager bean = (DataManager)context.getBean("dataManager");
        try {
			bean.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        context.close();
	}
	
}
