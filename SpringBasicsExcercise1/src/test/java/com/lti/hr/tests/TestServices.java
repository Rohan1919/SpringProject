package com.lti.hr.tests;

import java.util.ArrayList;

import org.springframework.beans.BeansException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.hr.entities.Dept;
import com.lti.hr.exceptions.HrException;
import com.lti.hr.services.DeptServices;


public class TestServices {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		try {
			DeptServices services=ctx.getBean(DeptServices.class);
			
			ArrayList<Dept> deptList=services.getDeptList();
			for(Dept dept:deptList) {
				System.out.println(dept);
			}
		} catch (BeansException e) {
			
			e.printStackTrace();
		} catch (HrException e) {
			
			e.printStackTrace();
		}
		
		ctx.close();
	}

}