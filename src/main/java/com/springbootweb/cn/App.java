package com.springbootweb.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *  
 * @author leen_pc
 *
 */
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(App.class);
		ConfigurableApplicationContext context = springApplication.run(args);
	}
}
