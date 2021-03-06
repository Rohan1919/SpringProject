package com.lti.hr.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.hr.daos.DeptDao;

import com.lti.hr.entities.Dept;

import com.lti.hr.exceptions.HrException;

@Service("empService")
public class DeptServicesImpl implements DeptServices {
	
	@Autowired       //by type injection
	private DeptDao dao;

	@Override
	public ArrayList<Dept> getDeptList() throws HrException {
		
		return dao.getDeptList();
	}

	

}
