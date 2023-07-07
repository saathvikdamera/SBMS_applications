package com.Damera.DAO.Impl;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Damera.DAO.UserDAO;

@Repository
public class UserDAOImpl implements UserDAO {
	
	JdbcTemplate jdbcTemplate;
	
	private final String SQL_INSERT_USER = "insert into user(id, first_name, last_name, age) values(?,?,?,?)";	
	
	@Autowired
	public UserDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public boolean save(int id,String fName,String lName,int age) {
		System.out.println("UserDAOImpl method...");
		return jdbcTemplate.update(SQL_INSERT_USER, id, fName, lName,age) > 0;
	}

}
