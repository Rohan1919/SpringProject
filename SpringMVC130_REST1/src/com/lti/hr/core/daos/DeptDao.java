package com.lti.hr.core.daos;

import java.util.ArrayList;

import com.lti.hr.core.entities.Department;
import com.lti.hr.core.exception.HrException;

public interface DeptDao {
	
	public ArrayList<Department> getDeptList() throws HrException;
	public boolean insertNewDept(Department d) throws HrException;
	public Department findDept(int id) throws HrException;
	
	
}
