package com.lti.hr.entities;

public class Employee {
	
	private int empNo;
	private String eName;
	private double eSal;
	private int deptNo;
	
	public Employee() {
	}
	
	
	public Employee(int empNo, String eName, double eSal) {
		
		this.empNo = empNo;
		this.eName = eName;
		this.eSal = eSal;
	}


	public Employee(int empNo, String eName, double eSal, int deptNo) {
	
		this.empNo = empNo;
		this.eName = eName;
		this.eSal = eSal;
		this.deptNo = deptNo;
	}


	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double geteSal() {
		return eSal;
	}
	public void seteSal(double eSal) {
		this.eSal = eSal;
	}

	public int getDeptNo() {
		return deptNo;
	}


	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}


	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", eName=" + eName + ", eSal=" + eSal + ", deptNo=" + deptNo + "]";
	}


	
	

}
