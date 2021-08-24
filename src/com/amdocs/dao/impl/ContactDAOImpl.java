package com.amdocs.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.amdocs.dao.ContactDAO;
import com.amdocs.db.DBUtil;
import com.amdocs.db.DataSourceUtil;
import com.amdocs.training.Contact;

public class ContactDAOImpl implements ContactDAO{
	
	

		

		@Override
		public boolean saveContact(Contact contact) {
			String query="Insert into Contac(user_id,name,email,phone_no,messege)t Values(?,?,?,?,?)";
			try {
				DataSource dataSource=DataSourceUtil.datasource();
				Connection conn = dataSource.getConnection();
				PreparedStatement ps=conn.prepareStatement(query);
				ps.setInt(1, contact.getId());
				ps.setString(2,contact.getName());
				ps.setString(3, contact.getEmail());
				ps.setString(4, contact.getPhone());
				ps.setString(5,contact.getMessage());
				ps.executeUpdate();
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// TODO Auto-generated method stub
			return false;
		}
		
	


}
