package com.lti.hr.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Dp")
@Table(name="dept")
public class Department {
	
	@Id
	@Column(name="DEPTNO")
	private int deptId;
	
	@Column(name="DNAME")
	private String deptNm;
	
	@Column(name="LOC")
	private String deptLoc;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	public Department(int deptId, String deptNm, String deptLoc) {
		super();
		this.deptId = deptId;
		this.deptNm = deptNm;
		this.deptLoc = deptLoc;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptNm() {
		return deptNm;
	}
	public void setDeptNm(String deptNm) {
		this.deptNm = deptNm;
	}
	public String getDeptLoc() {
		return deptLoc;
	}
	public void setDeptLoc(String deptLoc) {
		this.deptLoc = deptLoc;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptNm=" + deptNm + ", deptLoc=" + deptLoc + "]";
	}
	

}
