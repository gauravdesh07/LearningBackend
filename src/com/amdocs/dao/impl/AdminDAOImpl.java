package com.amdocs.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.amdocs.dao.AdminDAO;
import com.amdocs.db.DBUtil;
import com.amdocs.db.DataSourceUtil;
import com.amdocs.training.Admin;

public class AdminDAOImpl implements AdminDAO{

	@Override
	public Admin checkLogin(String email, String password) throws SQLException {
		DataSource datasource=DataSourceUtil.datasource();
		
		Connection conn = datasource.getConnection();

		String sql = "SELECT * FROM admin WHERE email = ? and password = ?";
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, email);
		statement.setString(2, password);

		ResultSet result = statement.executeQuery();

		Admin admin = null;

		if (result.next()) {
			admin = new Admin();
			admin.setName(result.getString("name"));
			admin.setEmail(email);
		}

		conn.close();

		return admin;

	}


}
