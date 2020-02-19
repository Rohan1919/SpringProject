package com.lti.hr.services;

import java.util.ArrayList;

import com.lti.hr.entities.Dept;

import com.lti.hr.exceptions.HrException;

public interface DeptServices {
	
	public ArrayList<Dept> getDeptList() throws HrException;

}
