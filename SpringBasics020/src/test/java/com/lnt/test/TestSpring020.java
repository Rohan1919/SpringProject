package com.lnt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lnt.appl.MyDao1;
import com.lnt.appl.MyDao2;

public class TestSpring020 {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");//object of MyDao1 is created 
		System.out.println("---------------------------------------------------------------------");
		MyDao1 dao=(MyDao1)ctx.getBean("dao1");
		MyDao1 dao1=(MyDao1)ctx.getBean("dao1");//constructor create d onlyb onece because object created one only
		
		System.out.println(dao);
		System.out.println(dao1);
		
//		MyDao2 dao3=(MyDao2)ctx.getBean("dao2");
//		dao3.printMessage();
//		
		
		
	}

}
