package com.empower.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class YourConfiguration {

	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource dmds=new DriverManagerDataSource();
		dmds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dmds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		dmds.setUsername("sys as sysdba");
		dmds.setPassword("password");
		return dmds;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(dataSource());
		return jt;
	}
}
