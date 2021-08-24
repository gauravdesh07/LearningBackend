package com.amdocs.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	
	private static Connection conn=null;

	
	static String dburl="jdbc:mysql://localhost:3306/projectschema";
	static String username="root";
	static String password="root";
	private DBUtil() {
	}
	
	public static Connection getConnection()
	{

		if(conn==null)
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection(dburl, username, password);
				return conn;
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

}
