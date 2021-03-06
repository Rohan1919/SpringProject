package com.lnt.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lnt.appl.EmpDao;
import com.lnt.appl.EmpDaoImpl;

public class TestSpring {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		//EmpDao dao1=(EmpDao) ctx.getBean("dao1");
		EmpDao dao1=ctx.getBean("dao1",EmpDao.class);//getBean() method is return object so we ned to typecast 
		//EmpDao dao1=ctx.getBean(EmpDao.class);
		System.out.println("dao1:"+dao1.hashCode());
		
		EmpDao dao2=(EmpDao) ctx.getBean("dao1");
		System.out.println("dao2:"+dao2.hashCode());
	}

}
