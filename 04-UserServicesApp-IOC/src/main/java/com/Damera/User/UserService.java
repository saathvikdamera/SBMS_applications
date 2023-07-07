package com.Damera.User;

import java.sql.SQLException;

public class UserService {
	
	private UserDAO dao;
	
	public UserService() {
		// TODO Auto-generated constructor stub
	}
	
	public UserService(UserDAO dao) {
		super();
		this.dao = dao;
	}

	public void setDao(UserDAO dao) {
		this.dao = dao;
	}
	
	public void printName(int id) throws Exception {
		String name = dao.findName(id);
		System.out.println("Employee name : "+name);
	}

}
