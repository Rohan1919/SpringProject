package com.lti.hr.core.daos;

import java.util.ArrayList;

import com.lti.hr.core.entities.Employee;
import com.lti.hr.core.exceptions.HrException;

public interface EmpDao {
	
	public ArrayList<Employee> getEmpList() throws HrException;

}
