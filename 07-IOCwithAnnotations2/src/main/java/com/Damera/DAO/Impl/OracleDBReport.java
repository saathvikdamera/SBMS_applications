package com.Damera.DAO.Impl;

import org.springframework.stereotype.Repository;

import com.Damera.DAO.ReportDAO;

@Repository
public class OracleDBReport implements ReportDAO {
	
	public String getData() {
		return "getting data from oracle db...";
	}

}
