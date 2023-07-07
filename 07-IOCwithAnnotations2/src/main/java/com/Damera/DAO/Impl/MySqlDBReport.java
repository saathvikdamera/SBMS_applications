package com.Damera.DAO.Impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.Damera.DAO.ReportDAO;

@Repository
@Qualifier("dao")
public class MySqlDBReport implements ReportDAO {

	public String getData() {
		return "getting data from MySQL db...";
	}

}
