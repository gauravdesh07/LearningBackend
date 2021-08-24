package com.amdocs.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.amdocs.dao.FeedbackDAO;
import com.amdocs.db.DBUtil;
import com.amdocs.db.DataSourceUtil;
import com.amdocs.training.Contact;
import com.amdocs.training.Feedback;

public class FeedbackDAOImpl implements FeedbackDAO{
	

	

	@Override
	public boolean saveFeedback(Feedback feedback) {
		String query="Insert into Feedback(user_id,name,email,feedback) Values(?,?,?,?)";
		try {
			DataSource dataSource=DataSourceUtil.datasource();
			Connection conn = dataSource.getConnection();
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setInt(1, feedback.getId());
			ps.setString(2,feedback.getName());
			ps.setString(3, feedback.getEmail());
			ps.setString(4,feedback.getFeedback());
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
