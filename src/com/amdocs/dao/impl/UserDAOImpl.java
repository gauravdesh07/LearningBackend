package com.amdocs.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.amdocs.dao.UserDAO;
import com.amdocs.db.DBUtil;
import com.amdocs.db.DataSourceUtil;
import com.amdocs.training.Course;
import com.amdocs.training.User;

public class UserDAOImpl implements UserDAO{


		@Override
		public boolean saveUser(User user) {
			
			String query="Insert into User1(name,phone_no,email,address,reg_date,password,upload_photo) Values(?,?,?,?,?,?,?)";
			try {
				DataSource dataSource=DataSourceUtil.datasource();
				Connection conn = dataSource.getConnection();
				PreparedStatement ps=conn.prepareStatement(query);
				ps.setString(1,user.getName());
				ps.setString(2, String.valueOf(user.getPhone()));
				ps.setString(3, user.getEmail());
				ps.setString(4, user.getAddress());

				ps.setDate(5, user.getRegistrationDate());
				ps.setString(6, user.getPassword());
				ps.setString(7, user.getUploadPhoto());
				ps.executeUpdate();
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public User checkLogin(String email, String password) throws SQLException {
			DataSource datasource=DataSourceUtil.datasource();
			
			Connection conn = datasource.getConnection();

			String sql = "SELECT * FROM user1 WHERE email = ? and password = ?";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, email);
			statement.setString(2, password);

			ResultSet result = statement.executeQuery();

			User user = null;

			if (result.next()) {
				user = new User();
				user.setName(result.getString("name"));
				user.setEmail(email);
			}

			//conn.close();

			return user;

		}

}
