package com.amdocs.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.amdocs.dao.CourseDAO;
import com.amdocs.db.DBUtil;
import com.amdocs.db.DataSourceUtil;
import com.amdocs.training.Course;

public class CourseDAOImpl implements CourseDAO {
	
	
	
	
	@Override
	public boolean saveCourse(Course course) {
		String query="Insert into Course(c_name,c_fees,c_desp,c_resource) Values(?,?,?,?)";
		try {
			DataSource dataSource=DataSourceUtil.datasource();
			Connection conn = dataSource.getConnection();	
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setString(1,course.getCourseName());
			ps.setString(2, course.getCourseFee());
			ps.setString(3, course.getDescription());
			ps.setString(4,course.getResources());
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
