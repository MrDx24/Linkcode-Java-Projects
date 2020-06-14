package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductDao {
	
	final String url = "jdbc:mysql://localhost/test";
	final String dbUsernm = "root";
	final String dbPass = "root";
	public Connection con = null;
	public PreparedStatement psSelect = null;
	public ResultSet rs = null;

	public ProductDao() {
		// TODO Auto-generated constructor stub
	}
	
	public void myConnection() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url,dbUsernm,dbPass);
		if(con != null) {
			System.out.println("Connected");
		}
	}
	
	public void getData() throws Exception{
		myConnection();
		
		psSelect = con.prepareStatement("select * from products");
		rs = psSelect.executeQuery();
		
		if(rs.next()) {
			System.out.println("ok");
		}
		
	}
	

}
