package com.Damera.User;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAOImpl implements UserDAO{

	public String findName(int id) throws SQLException, Exception {
		//Class.forName(AppConstants.DRIVER_CLASS);
		Connection con = DriverManager.getConnection(AppConstants.URL, AppConstants.UNAME, AppConstants.PWD);
		PreparedStatement pstmt = con.prepareStatement("select * from employee where emp_id = ?");
		pstmt.setInt(1, id);

		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			System.out.println("Name Found..");
			return rs.getString(2);
		}else {
			return "Name not found";
		}
	}




}
