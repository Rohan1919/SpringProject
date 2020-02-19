package com.lti.hr.entities;

public class Dept {
	
	private int dNo;
	private String dName;
	
	public Dept() {
	}


	public Dept(int dNo, String dName) {
		super();
		this.dNo = dNo;
		this.dName = dName;
	}

	public int getdNo() {
		return dNo;
	}

	public void setdNo(int dNo) {
		this.dNo = dNo;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	@Override
	public String toString() {
		return "Dept [dNo=" + dNo + ", dName=" + dName + "]";
	}
}
