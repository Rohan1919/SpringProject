package com.lnt.appl.daos;

import java.util.ArrayList;

import com.lnt.appl.exceptions.HrException;
import com.lnt.entities.Employee;

public interface EmpDao {
	
	public ArrayList<Employee> getEmpList() throws HrException;
	
}
