package com.justIt.service;

import java.sql.SQLException;

import com.justIt.dao.UserDaoImpl;
import com.justIt.domain.User;

public class UserService {
	UserDaoImpl ud = new UserDaoImpl();
	
	public void addUser(User u) {
		ud.add(u);
	}
	
	public void deleUser(String id) throws SQLException {
		ud.dele(id);
	}
	
	public void alter(User u) throws SQLException {
		ud.alter(u);
	}
	
	public User search(String id) throws SQLException {
		return ud.search(id);
	}
	
	
}
