package com.empower.demo.config;

import javax.sql.DataSource;

import java.io.File;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DbConfiguration {

	@Bean
	public DataSource dataSource() {
		 String dbFolder = "./data";
		    File folder = new File(dbFolder);
		    if (!folder.exists()) {
		        folder.mkdirs(); // create folder if it doesn't exist
		    }

		    DriverManagerDataSource dmds = new DriverManagerDataSource();
		    dmds.setDriverClassName("org.h2.Driver");
		    dmds.setUrl("jdbc:h2:file:./data/testdb;DB_CLOSE_ON_EXIT=FALSE");
		    dmds.setUsername("sa");
		    dmds.setPassword("");
		    return dmds;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jt=new JdbcTemplate();
		jt.setDataSource(dataSource());
		return jt;
	}
	
	
}
