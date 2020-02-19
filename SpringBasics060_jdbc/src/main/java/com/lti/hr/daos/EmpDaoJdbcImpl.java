package com.lti.hr.daos;


import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.lti.hr.entities.Employee;
import com.lti.hr.exceptions.HrException;

@Repository
public class EmpDaoJdbcImpl implements EmpDao{

	@Autowired
	private JdbcTemplate template;
	
	@Override
	public ArrayList<Employee> getEmpList() throws HrException {
		String query="select empno,ename,sal from emp";
		List<Map<String,Object>> list=template.queryForList(query,new Object[] {});
		
		ArrayList<Employee> al=new ArrayList<>();
		
		System.out.println("\n\t\tEmpNo\tEName\t\tSal");
		for(Map<String,Object> item:list) {
			int eNo=((BigDecimal)item.get("empno")).intValue();
			String eName=(String)item.get("ename");
			double empSal=((BigDecimal)item.get("sal")).intValue();
			Employee emp=new Employee(eNo,eName,empSal);
			al.add(emp);
		}
		return al;
	}

	@Override
	public Employee getEmpDetails(int empNo) throws HrException {
		//it only prints the name of the employee but only single column data if two or more column
		//are present then it will not work because it does not know how to wrap data into object
		String query="select ENAME,EMPNO,SAL,DEPTNO from EMP where EMPNO=?";
        //		String empName=template.queryForObject(query,new Object[] {empNo},String.class);
        //		System.out.println("Name for employee : " +empName);
       
		RowMapper mapper =new RowMapper<Employee>() {
			public Employee mapRow(ResultSet rs,int rowNum) throws SQLException{
				int empNo=rs.getInt("EMPNO");
			    String eName=rs.getString("ENAME");
				double empSal=rs.getDouble("SAL");
				int deptno=rs.getInt("DEPTNO");
				Employee emp=new Employee(empNo,eName,empSal,deptno);
				return emp;
			}
		};
		Employee emp=(Employee)template.queryForObject(query,mapper,empNo);
		return emp;
	}

	@Override
	public void insetNewEmployee(Employee emp) throws HrException {
		
		String query="insert into EMP(EMPNO,ENAME,SAL,DEPTNO)values(?,?,?,?)";
		template.update(query,new Object[] {emp.getEmpNo(),emp.geteName(),emp.geteSal(),emp.getDeptNo()});
		
	}

}
