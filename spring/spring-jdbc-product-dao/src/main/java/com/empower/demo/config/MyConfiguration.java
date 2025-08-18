package com.empower.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"com"})
public class MyConfiguration {

	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource dmds=new DriverManagerDataSource();
    	dmds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
    	dmds.setUsername("sys as sysdba");
    	dmds.setPassword("password");
    	dmds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
    	return dmds;
	}
	
	@Bean
	public JdbcTemplate jt() {
		JdbcTemplate jt=new JdbcTemplate();
//		DriverManagerDataSource dmds = dataSource();
//		jt.setDataSource(dmds);
		jt.setDataSource(dataSource());
		return jt;
	}
}
