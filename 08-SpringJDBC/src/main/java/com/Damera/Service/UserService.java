package com.Damera.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Damera.DAO.UserDAO;

@Service
public class UserService {
	
	@Autowired
	private UserDAO dao;
	
	public void saveUser(int id,String fName,String lName,int age) {
		System.out.println("Userservice method...");
		boolean status = dao.save(id, fName, lName, age);
		if(status) {
			System.out.println("Record Inserted..");
		}else {
			System.out.println("Record Not Inserted..");
		}
		
	}

}
