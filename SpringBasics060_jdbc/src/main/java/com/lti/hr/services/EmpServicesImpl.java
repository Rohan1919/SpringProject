package com.lti.hr.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.hr.daos.EmpDao;
import com.lti.hr.entities.Employee;
import com.lti.hr.exceptions.HrException;

@Service("empService")
public class EmpServicesImpl implements EmpServices {
	
	@Autowired       //by type injection
	private EmpDao dao;

	@Override
	public ArrayList<Employee> getEmpList() throws HrException {
		
		return dao.getEmpList();
	}

	@Override
	public Employee getEmpDetails(int empNo) throws HrException {
		
		return dao.getEmpDetails(empNo);
	}

	@Override
	public void joinNewEmployee(Employee emp) throws HrException {
		dao.insetNewEmployee(emp);
	}

}
