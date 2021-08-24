package com.amdocs.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;



public class DataSourceUtil {
	

	public static DataSource datasource()
	{
		try {
			BasicDataSource ds=new BasicDataSource();
			ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
			ds.setUrl("jdbc:mysql://localhost:3306/projectschema");
			ds.setUsername("root");
			ds.setPassword("root");
			return ds;
		} catch (Exception ex) {
			return null;
		}
	}
	
	
	
}
