package com.empower.demo;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

/**
 * Hello world!
 *
 */
public class AppResultSetMetadata 
{
    public static void main( String[] args ) throws SQLException
    {
    	Driver driver=new OracleDriver();
    	String url="jdbc:oracle:thin:@localhost:1521:XE";
		String username="sys as sysdba";
		String password="password";
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM PRODUCT");
		ResultSetMetaData rsmd = rs.getMetaData();
//		System.out.println(rsmd.getColumnCount());
		for(int i=1;i<=rsmd.getColumnCount();i++) {
			String type = rsmd.getColumnTypeName(i);
			switch(type) {
			case "NUMBER":
				System.out.print(rsmd.getColumnName(i)+"\t");	
				break;
			case "VARCHAR2":
				System.out.print(rsmd.getColumnName(i)+"\t\t\t\t");
				break;
			
			}
			
		}
		
		System.out.println("\n--------------------------------------");
		
		while(rs.next()) {
			for(int i=1;i<=rsmd.getColumnCount();i++) {
				String type = rsmd.getColumnTypeName(i);
				switch(type) {
				case "NUMBER":
					System.out.print(rs.getFloat(i)+"\t");	
					break;
				case "VARCHAR2":
					System.out.print(rs.getString(i)+"\t\t\t\t");
					break;
				
				}
				
			}	
			System.out.println();
		}
    }
}

