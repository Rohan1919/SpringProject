package com.lti.hr.core.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.hr.core.daos.DeptDao;
import com.lti.hr.core.entities.Department;
import com.lti.hr.core.exception.HrException;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
	private DeptDao dao;
	@Override
	public ArrayList<Department> getDeptList() throws HrException {
		
		return dao.getDeptList();
	}
	
	@Transactional(propagation =Propagation.REQUIRES_NEW)
	@Override
	public boolean createNewDepartment(Department dept) throws HrException {
		return dao.insertNewDept(dept);
	
	}
	@Transactional(propagation =Propagation.REQUIRES_NEW)
	@Override
	public Department findDept(int id) throws HrException {
		// TODO Auto-generated method stub
		return dao.findDept(id);
	}

}
