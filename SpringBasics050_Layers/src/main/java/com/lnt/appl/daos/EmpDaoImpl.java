package com.lnt.appl.daos;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.lnt.appl.exceptions.HrException;
import com.lnt.entities.Employee;

/**
 * @Component:
 *   @Repository:It represent DAO Classes
 *   @Service:It represent Service Classes
 *   @Controller:It represent Controller classes of Spring MVC  
 *	@RestController: it represents Rest Layer odf web services
 */
@Repository("empDao")
public class EmpDaoImpl implements EmpDao {

	@Override
	public ArrayList<Employee> getEmpList() throws HrException {
		System.out.println("In getEmpList() of Dao");
		return null;
	}

}
