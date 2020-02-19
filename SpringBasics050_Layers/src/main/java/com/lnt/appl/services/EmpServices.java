package com.lnt.appl.services;

import java.util.ArrayList;

import com.lnt.appl.exceptions.HrException;
import com.lnt.entities.Employee;

public interface EmpServices {
	
	public ArrayList<Employee> getEmpList() throws HrException;

}
