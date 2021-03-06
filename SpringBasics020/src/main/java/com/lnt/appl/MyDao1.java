package com.lnt.appl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 
 * The @Component:Declares a bean for instatiation
 * the @Value:Mention initial value for the variable to instatiate it
 * THe @Autowired:Inject the dependency  
 *The @Quyalifier:need to qualify a bean "ByNAme" Di....
 */
@Component("dao1")
public class MyDao1 {
	
	@Value("Larson And Turbo")
	private String companyName;
	
	@Value("Mahape")
	private String address;
	
	@Autowired //By Type injection of MyDao2
	@Qualifier("dao2")
	private MyDao2 mydao2;
	
	public MyDao1() {
		System.out.println("object of MyDao1() created");
	}
	public MyDao1(String companyName) {
		System.out.println("object of MyDao1(String companyName) created");
		this.companyName=companyName;
	}
	public MyDao1(String companyName,String address) {
		System.out.println("object of MyDao1(String companyName,String address) created");
		this.companyName=companyName;
		this.address=address;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public MyDao2 getMydao2() {
		return mydao2;
	}
	public void setMydao2(MyDao2 mydao2) {
		this.mydao2 = mydao2;
	}
//	@Override
//	public String toString() {
//		return "MyDao1 [companyName=" + companyName + ", address=" + address + "]";
//	}
//
//	
	@Override
	public String toString() {
		return "MyDao1 [companyName=" + companyName + ", address=" + address + ", mydao2=" + mydao2 + "]";
	}
	
}
