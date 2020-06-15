package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.model.Bill;

import java.util.ArrayList;

public class ProductDao {
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public ProductDao() {
		// TODO Auto-generated constructor stub
	}
	public Connection getConnection()
	{
		try 
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sanket123");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return con;
	}
	
	public int save(List<Bill> lst)
	{
		int i=0;
		con=getConnection();
		Bill obj=lst.get(0);
		
		try
		{
			ps=con.prepareStatement("insert into Billtable values(?,?,?,?,?)");
			ps.setString(1, obj.getName());
			ps.setDouble(2, obj.getTotal());
			ps.setDouble(3, obj.getCgst());
			ps.setDouble(4, obj.getSgst());
			ps.setDouble(5, obj.getFinalBill());

			i=ps.executeUpdate();
			
			if(i>0)
			{
				System.out.println("Inserted Successfully");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return i;
	}	
	public List<Bill> getAllData()
	{
		List<Bill> list=new ArrayList<>();
		con=getConnection();
		
		try
		{
			ps=con.prepareStatement("select * from studentData");
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				Bill obj=new Bill();
				obj.setName(rs.getString(1));
				obj.setTotal(rs.getDouble(2));
				obj.setFinalBill(rs.getDouble(3));
				list.add(obj);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
	}


}
