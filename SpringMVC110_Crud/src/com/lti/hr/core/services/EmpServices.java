package com.lti.hr.core.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.lti.hr.core.entities.Employee;
import com.lti.hr.core.exceptions.HrException;


public interface EmpServices {
	
	public ArrayList<Employee> getEmpList() throws HrException;
	public boolean isAuthenticated(String userNm,String passWd);

}
