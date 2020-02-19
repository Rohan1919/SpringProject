package com.lti.hr.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.hr.entities.Employee;
import com.lti.hr.exceptions.HrException;

/**
 * @Component:
 *   @Repository:It represent DAO Classes
 *   @Service:It represent Service Classes
 *   @Controller:It represent Controller classes of Spring MVC  
 *	@RestController: it represents Rest Layer odf web services
 */

/**
 * The SQLException must not come from a dao .Instead ,let the custom exception come.
 * The Custom Exception must be chained with SQLException to pass-on complete stacktrace to the client side.
 * No method of DAO to return ResultSet .Instead return collection of Objects  
 *Always close resources in exactly opposite  of order of opened them.
 *Always closed resources in finalize method.
 *The close() of connection is obtained from Data Source does not close conncetion but return back to the Data Source
 */
@Repository("empDao")
public class EmpDaoImpl implements EmpDao {
	
	@Autowired
	private DataSource ds;
	
	@Override
	public ArrayList<Employee> getEmpList() throws HrException {
		System.out.println("In getEmpList() of Dao");
		Connection connect=null;
		Statement stmt=null;
		ResultSet rs=null;
		ArrayList<Employee> empList=new ArrayList<>();
    try {
		connect=ds.getConnection();
		stmt=connect.createStatement();
		rs=stmt.executeQuery("select empno,ename,sal from emp");
		
		while(rs.next()) {
			int empNo=rs.getInt("empno");
			String empNm=rs.getString("ename");
			float empSal=rs.getFloat("sal");
			
			Employee emp=new Employee(empNo,empNm,empSal);
			empList.add(emp);
			
		}
		}
		catch(SQLException e) {
			throw new HrException("Exception  in method getEmpList() from dao",e);
		}
        finally {
        	try {
				if(rs!=null)
					rs.close();
				if(stmt!=null)
					stmt.close();
				if(connect!=null)
					connect.close();
			} catch (SQLException e) {
				throw new HrException("Exception in method close() for dao",e);
			}
		}

		return empList;
	}

}
