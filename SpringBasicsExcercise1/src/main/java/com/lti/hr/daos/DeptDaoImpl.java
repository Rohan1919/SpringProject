package com.lti.hr.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.hr.entities.Dept;

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
public class DeptDaoImpl implements DeptDao {
	
	@Autowired
	private DataSource ds;
	
	@Override
	public ArrayList<Dept> getDeptList() throws HrException {
		System.out.println("In getDeptList() of Dao");
		Connection connect=null;
		Statement stmt=null;
		ResultSet rs=null;
		ArrayList<Dept> deptList=new ArrayList<>();
    try {
		connect=ds.getConnection();
		stmt=connect.createStatement();
		rs=stmt.executeQuery("select deptno,dname from dept");
		
		while(rs.next()) {
			int dNo=rs.getInt("deptno");
			String dNm=rs.getString("dname");
		
			
			Dept dept=new Dept(dNo,dNm);
			deptList.add(dept);
			
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

		return deptList;
	}

}
