package com.lti.hr.daos;

import java.util.ArrayList;

import com.lti.hr.entities.Employee;
import com.lti.hr.exceptions.HrException;

public interface EmpDao {
	
	public ArrayList<Employee> getEmpList() throws HrException;
	public Employee getEmpDetails(int empNo) throws HrException;
	public void insetNewEmployee(Employee emp) throws HrException;
}
