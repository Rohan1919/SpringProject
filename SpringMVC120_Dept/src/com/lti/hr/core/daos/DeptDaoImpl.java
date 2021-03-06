package com.lti.hr.core.daos;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.hr.core.entities.Department;
import com.lti.hr.core.exception.HrException;

/**
 * RequiresNew: always create new transaction
 * Required: Use transaction Which is already created.
 * if it is not created, create news 
 */
@Repository
public class DeptDaoImpl implements DeptDao {
    
	@PersistenceContext
	private EntityManager manager;
    
	@Override
	public ArrayList<Department> getDeptList() throws HrException {
		Query qry=manager.createQuery("from Dp");
		ArrayList<Department> deptList=(ArrayList<Department>) qry.getResultList();
		return deptList;
	}
	@Transactional(propagation =Propagation.REQUIRED)
	@Override
	public boolean insertNewDept(Department dept) throws HrException {
		manager.persist(dept);
		return true;
	}

}
