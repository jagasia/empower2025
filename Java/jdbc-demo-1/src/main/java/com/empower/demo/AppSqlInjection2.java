package com.empower.demo;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class AppSqlInjection2 {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		String uid=sc.nextLine();
		String pwd=sc.nextLine();
		Driver driver = new OracleDriver();
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "sys as sysdba";
		String password = "password";
		Connection con = DriverManager.getConnection(url, username, password);
//		Statement st = con.createStatement();
//		ResultSet rs = st.executeQuery("SELECT * FROM USER_MASTER WHERE USERNAME='"+uid+"' AND PASSWORD='"+pwd+"'");
		
		PreparedStatement st=con.prepareStatement("SELECT * FROM USER_MASTER WHERE USERNAME=? AND PASSWORD=?");
		st.setString(1, uid);
		st.setString(2, pwd);
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()){
			System.out.println("Login successful");
		}else {
			System.out.println("Login failed");
		}
		con.close();
	}

}
