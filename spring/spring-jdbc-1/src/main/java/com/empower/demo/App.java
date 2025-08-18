package com.empower.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jt= (JdbcTemplate) ctx.getBean("jt");
		int no = jt.update("UPDATE PRODUCT SET price=20.0 WHERE id=101");
		System.out.println(no+" row(s) affected");
	}

}
