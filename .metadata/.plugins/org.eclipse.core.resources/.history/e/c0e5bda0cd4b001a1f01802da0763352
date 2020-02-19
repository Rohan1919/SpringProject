package com.lnt.appl;

import java.util.ArrayList;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * if bean id is not mentioned,picks up Class name which converted to Camel Case and uses as id
 * by default bean is Singleton. use @Scope to declare as prototype.
 * @Scope("singleton") creates a bean only once . it is default 
 * @Scope("prototype") creates a bean as many time as you demand 
 */
@Component("dao1")
@Scope("prototype")
//@Scope("singleton")
public class EmpDaoImpl implements EmpDao {
	
	public EmpDaoImpl() {
		System.out.println("object EmpDaoImpl created here.");
	}
	public ArrayList<String> getEmpList(){
		ArrayList<String> empList=new ArrayList<>();
		empList.add("Rohan");
		empList.add("Ravan");
		
		return empList;
	}

}
