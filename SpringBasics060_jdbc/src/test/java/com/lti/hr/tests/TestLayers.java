package com.lti.hr.tests;

import java.util.ArrayList;

import org.springframework.beans.BeansException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.hr.entities.Employee;
import com.lti.hr.exceptions.HrException;
import com.lti.hr.services.EmpServices;

public class TestLayers {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		try {
			EmpServices services=ctx.getBean(EmpServices.class);
			
			ArrayList<Employee> empList=services.getEmpList();
			for(Employee emp:empList) {
				System.out.println(emp);
			}
			System.out.println("\n Details of Employee 7499:");
			Employee empl=services.getEmpDetails(7499);
			System.out.println(empl);
//			
//			Employee emp1=new Employee();
//			emp1.setEmpNo(200);
//			emp1.seteName("Ravan");
//			emp1.seteSal(10000000);
//			emp1.setDeptNo(90);
//			services.joinNewEmployee(emp1);
//			
			Employee emp1=new Employee(7500,"hhfggan",89000,10);
			services.joinNewEmployee(emp1);
			Employee emp3=services.getEmpDetails(7500);
			System.out.println(emp3);
		} catch (BeansException e) {
			
			e.printStackTrace();
		} catch (HrException e) {
			
			e.printStackTrace();
		}
		
		ctx.close();
	}

}
