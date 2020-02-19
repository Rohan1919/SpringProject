package com.lti.hr.services;

import java.util.ArrayList;

import com.lti.hr.entities.Employee;
import com.lti.hr.exceptions.HrException;

public interface EmpServices {
	
	public ArrayList<Employee> getEmpList() throws HrException;
	public Employee getEmpDetails(int empNo) throws HrException;
	public void joinNewEmployee(Employee emp) throws HrException;
}
