package com.Damera.User;

import java.sql.SQLException;

public interface UserDAO {

	String findName(int id) throws SQLException, Exception;
	
}
