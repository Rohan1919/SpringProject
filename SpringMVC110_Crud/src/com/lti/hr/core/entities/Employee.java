package com.lti.hr.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMP")
public class Employee {
	@Id
	@Column(name="EMPNO")
	private int empno;
	@Column(name="ENAME")
	private String empNm;
	@Column(name="SAL")
	private Double empSal;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empno, String empNm, Double empSal) {
		super();
		this.empno = empno;
		this.empNm = empNm;
		this.empSal = empSal;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEmpNm() {
		return empNm;
	}

	public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empNm=" + empNm + ", empSal=" + empSal + "]";
	}
	

}
