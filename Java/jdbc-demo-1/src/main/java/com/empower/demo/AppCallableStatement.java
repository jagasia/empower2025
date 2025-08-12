package com.empower.demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Types;
import java.util.Scanner;

public class AppCallableStatement {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sys as sysdba","password");
		CallableStatement st = con.prepareCall("call get_product_details(?,?,?,?)");
		st.setInt(1, id);
		
		st.registerOutParameter(2, Types.VARCHAR);
		st.registerOutParameter(3, Types.VARCHAR);
		st.registerOutParameter(4, Types.NUMERIC);
		
		String name, category;
		Double price;
		
		st.execute();
		
		name=st.getString(2);
		category=st.getString(3);
		price=st.getDouble(4);
		
		System.out.println(name);
		System.out.println(category);
		System.out.println(price);
		
		
	}

}
