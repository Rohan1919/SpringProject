package com.lnt.appl;

public class MyDao1 {
	private String companyName;
	private String address;
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
	@Override
	public String toString() {
		return "MyDao1 [companyName=" + companyName + ", address=" + address + ", mydao2=" + mydao2.printMessage() + "]";
	}
	
}
