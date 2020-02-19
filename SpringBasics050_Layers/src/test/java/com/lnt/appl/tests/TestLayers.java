package com.lnt.appl.tests;

import java.util.ArrayList;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lnt.appl.exceptions.HrException;
import com.lnt.appl.services.EmpServices;
import com.lnt.appl.services.EmpServicesImpl;
import com.lnt.entities.Employee;

public class TestLayers {

	public static void main(String[] args) {
		
		/**
		 * 1.While Creating the context,it will create Dao bean First.
		 * 2.It will create Service bean and will do DI of Dao bean inside it.
		 * 3.context is ready.
		 */
		
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		EmpServices services=ctx.getBean("empService",EmpServices.class);
		
		try {
			/**
			 * 1.call of service method will take control to method in service class 
			 * 2.service class method does call to method in dao class.
			 * 3.control goes to method in dao class
			 * 
			 */
		ArrayList<Employee> empList=services.getEmpList();
		}
		catch(HrException e) {
		 e.printStackTrace();	
		}
		
		ctx.close();
	}

}
