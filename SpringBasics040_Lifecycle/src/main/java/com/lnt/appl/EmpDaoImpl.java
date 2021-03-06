package com.lnt.appl;

import java.util.ArrayList;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("dao")
@Scope("singleton")
public class EmpDaoImpl implements EmpDao,InitializingBean,DisposableBean {
	
	private String companyName;
	
	public EmpDaoImpl() {
		System.out.println("object EmpDaoImpl created here.");
	}
	
	
	public String getCompanyName() {
		return companyName;
	}

	@Value("Larson and Turbo Information")
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
		System.out.println("Setter  called");
	}


	public ArrayList<String> getEmpList(){
		
		ArrayList<String> empList=new ArrayList<>();
		empList.add("Rohan");
		empList.add("Ravan");
		
		return empList;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("the afterPropertiesSet() called. ");
		
	}

	@Override
	public void destroy() throws Exception {
		
		System.out.println("IN destroy()");
		
	}

}
