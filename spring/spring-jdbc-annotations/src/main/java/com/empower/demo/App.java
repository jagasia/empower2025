package com.empower.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.empower.demo.config.MyConfiguration;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfiguration.class);
		
		
		JdbcTemplate jt = ctx.getBean(JdbcTemplate.class);
		int no = jt.update("DELETE FROM PRODUCT WHERE ID=101");
		System.out.println(no+" row(s) deleted");
		
	}

}
