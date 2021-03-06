package com.lti.hr.core.daos;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.hr.core.entities.Employee;
import com.lti.hr.core.exceptions.HrException;

@Repository
public class EmpDaoImpl implements EmpDao {

	@PersistenceContext
	private EntityManager manager;
    @Override
	public ArrayList<Employee> getEmpList() throws HrException {
		String s="from Employee";
    	Query qry=manager.createQuery(s);
		ArrayList<Employee> empList=(ArrayList<Employee>)qry.getResultList();
		return empList;
	}

}
