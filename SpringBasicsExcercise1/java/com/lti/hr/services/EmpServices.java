package com.lti.hr.services;

import java.util.ArrayList;

import com.lti.hr.entities.Employee;
import com.lti.hr.exceptions.HrException;

public interface EmpServices {
	
	public ArrayList<Employee> getEmpList() throws HrException;

}
