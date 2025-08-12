package com.empower.demo;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

/**
 * Hello world!
 *
 */
public class App 
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
		System.out.printf("%s\t%-25s\t%-15s\t%s\n","id", "name", "category", "price");
		System.out.println("-----------------------------------------------------");
		while(rs.next()) {
			System.out.printf("%d\t%-25s\t%-15s\t%.2f\n",rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4));
		}
        System.out.println( "Hello World!" );
    }
}

