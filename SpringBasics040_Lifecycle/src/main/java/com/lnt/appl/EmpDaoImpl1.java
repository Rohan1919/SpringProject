package com.lnt.appl;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component("dao1")
public class EmpDaoImpl1 implements EmpDao{

	@Override
	public ArrayList<String> getEmpList() {
		
		return null;
	}
	
	@PostConstruct
	public void initAllValues() {
		System.out.println("In initAllValues()");
	}

}
