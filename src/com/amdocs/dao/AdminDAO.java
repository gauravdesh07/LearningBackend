package com.amdocs.dao;

import java.sql.SQLException;

import com.amdocs.training.Admin;

public interface AdminDAO {

	Admin checkLogin (String email, String password) throws SQLException;
}
