package com.empower.demo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Hello world!
 *
 */
public class App_Old 
{
    public static void main( String[] args )
    {
    	DriverManagerDataSource dmds=new DriverManagerDataSource();
    	dmds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
    	dmds.setUsername("sys as sysdba");
    	dmds.setPassword("password");
    	dmds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
    	
    	
    	JdbcTemplate jt=new JdbcTemplate();
    	jt.setDataSource(dmds);
    	
    	jt.update("INSERT INTO PRODUCT values(101, 'Pen', 'Stationery', 11.1)");
    	
    	
        System.out.println( "Hello World!" );
    }
}
