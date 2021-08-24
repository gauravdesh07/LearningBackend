package com.amdocs.dao;

import java.sql.SQLException;

import com.amdocs.training.User;

public interface UserDAO {

	boolean saveUser(User user);
	
	User checkLogin (String email, String password) throws SQLException;

}
