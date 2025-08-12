package com.empower.demo;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AppScrollable {

	public static void main(String[] args) throws SQLException {
    	String url="jdbc:oracle:thin:@localhost:1521:XE";
		String username="sys as sysdba";
		String password="password";
		Connection con = DriverManager.getConnection(url, username, password);
		DatabaseMetaData dbmd = con.getMetaData();
		System.out.println(dbmd.getDatabaseProductName());
		System.out.println(dbmd.getDatabaseProductVersion());
		System.out.println(dbmd.getDriverName());
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
//		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM PRODUCT");
		rs.afterLast();
		while(rs.previous()) {
			System.out.println(rs.getString(2));
		}

	}

}
