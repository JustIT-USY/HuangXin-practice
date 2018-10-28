package com.justIt.dao;

import java.sql.SQLException;

import com.justIt.domain.User;

public interface UserDao {
	public void add(User u);
	
	public void dele(String id) throws SQLException;
	
	public void alter(User u) throws SQLException;
	
	public User search(String id) throws SQLException;

}
