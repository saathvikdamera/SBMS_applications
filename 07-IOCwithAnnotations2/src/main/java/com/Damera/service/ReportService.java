package com.Damera.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.Damera.DAO.ReportDAO;

@Service
public class ReportService {
	
	@Autowired
	@Qualifier("dao")
	private ReportDAO dao;
	
	public void fetchData() {
		String data = dao.getData();
		System.out.println(data);
	}

}
