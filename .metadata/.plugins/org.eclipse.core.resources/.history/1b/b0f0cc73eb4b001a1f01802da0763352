package com.lnt.appl.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnt.appl.daos.EmpDao;
import com.lnt.appl.exceptions.HrException;
import com.lnt.entities.Employee;

@Service("empService")
public class EmpServicesImpl implements EmpServices {
	
	@Autowired       //by type injection
	private EmpDao dao;

	@Override
	public ArrayList<Employee> getEmpList() throws HrException {
		
		return dao.getEmpList();
	}

}
