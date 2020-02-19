package com.lti.hr.core.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.hr.core.daos.EmpDao;
import com.lti.hr.core.entities.Employee;
import com.lti.hr.core.exceptions.HrException;

@Service
public class EmpServicesImpl implements EmpServices {
  
	@Autowired
	private EmpDao dao;
	@Override
	public ArrayList<Employee> getEmpList() throws HrException {
		return dao.getEmpList();
	}

	@Override
	public boolean isAuthenticated(String userNm, String passWd) {
		
		if((userNm.equals("aaa")) && (passWd.equals("bbb"))) 
			return true;
		else
			return false;
	}

}
