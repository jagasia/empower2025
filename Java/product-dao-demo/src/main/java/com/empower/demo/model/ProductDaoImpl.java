package com.empower.demo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {
	
	private Connection retrieveConn() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sys as sysdba","password");
		return con;
	}
	
	@Override
	public int create(Product product) throws SQLException {
		//insert
		Connection con = retrieveConn();
		PreparedStatement st = con.prepareStatement("INSERT INTO PRODUCT VALUES(?,?,?,?)");
		st.setLong(1, product.getId());
		st.setString(2, product.getName());
		st.setString(3, product.getCategory());
		st.setDouble(4, product.getPrice());
		
		int no=st.executeUpdate();
		con.close();
		return no;
	}
	
	@Override
	public List<Product> read() throws SQLException {
		//select all product
		Connection con = retrieveConn();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM PRODUCT");
		List<Product> products=new ArrayList<>();
		while(rs.next()) {
			Product product=new Product(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getDouble(4));
			products.add(product);
		}
		con.close();
		return products;
	}
	@Override
	public Product read(Long id) throws SQLException {
		//select product where id=?
		Connection con = retrieveConn();
		PreparedStatement st = con.prepareStatement("SELECT * FROM PRODUCT WHERE ID=?");
		st.setLong(1, id);
		
		ResultSet rs = st.executeQuery();
		Product product=null;
		if(rs.next()) {
			product=new Product(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getDouble(4));
		}
		con.close();
		return product;
	}
	@Override
	public int update(Product product) throws SQLException {
		Connection con = retrieveConn();
		PreparedStatement st = con.prepareStatement("UPDATE PRODUCT SET NAME=?, CATEGORY=?, PRICE=? WHERE ID=?");

		st.setString(1, product.getName());
		st.setString(2, product.getCategory());
		st.setDouble(3, product.getPrice());
		st.setLong(4, product.getId());
		
		int no=st.executeUpdate();
		con.close();
		return no;
	}
	@Override
	public int delete(Long id) throws SQLException {
		Connection con = retrieveConn();
		PreparedStatement st = con.prepareStatement("DELETE FROM PRODUCT WHERE ID=?");

		st.setLong(1, id);
		
		int no=st.executeUpdate();
		con.close();
		return no;
	}
	
}
