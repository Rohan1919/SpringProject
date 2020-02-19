package com.lti.hr.daos;

import java.util.ArrayList;

import com.lti.hr.entities.Dept;

import com.lti.hr.exceptions.HrException;

public interface DeptDao {
	
	public ArrayList<Dept> getDeptList() throws HrException;
	
}
