package com.lti.hr.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.hr.core.entities.Department;
import com.lti.hr.core.exception.HrException;
import com.lti.hr.core.services.DeptService;

@RestController
public class HrRsController {
	
	@Autowired
	private DeptService service;
	
	/**
	 *	//http://localhost:8686/SpringMVC130_REST1/deptList
	@RequestMapping(name="/deptList",produces="application/json",method=RequestMethod.GET)//-->this steps are used to covert data to the jason format for that we are using mvc that
	<dependency>
<groupId>com.fasterxml.jackson.core</groupId>
<artifactId>jackson-databind</artifactId>
<version>${jackson-version}</version>
</dependency>
-->by injecting this dependency we are downloading json dependencies so that we are able to convert json object to java object and java object to json	
	public @ResponseBody ArrayList<Department> getDeptList(){ 
	 */
	
	
	//http://localhost:8686/SpringMVC130_REST1/deptList
	//@RequestMapping(name="/deptList",produces="application/json",method=RequestMethod.GET)
	@GetMapping(value="/deptList",produces="application/json")//similar to requestmapping but we no need to write method 
	public @ResponseBody ArrayList<Department> getDeptList(){
		ArrayList<Department> deptList=null;
		try {
			deptList = service.getDeptList();
		} catch (HrException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return deptList;	
	}
	
	
	@PostMapping(value="/addDept",consumes="application/json")
	public void getDeptList(@RequestBody Department dept) {
		System.out.println(dept);
		try {
			service.createNewDepartment(dept);
		} catch (HrException e) {
	
			e.printStackTrace();
		}
	}
	@PostMapping(value="/findDept",consumes="application/json")
	public @ResponseBody Department getDeptList(@RequestParam int id) {
		System.out.println(id);
		Department d=null;
		try {
			d=service.findDept(id);
			System.out.println(d);
			
		} catch (HrException e) {
	
			e.printStackTrace();
		}
		return d;
	}

}
