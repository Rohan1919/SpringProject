package com.lti.hr.web.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.hr.core.entities.Employee;
import com.lti.hr.core.exceptions.HrException;
import com.lti.hr.core.services.EmpServices;
/**
 * @Controller: Defines a bean as Spring MVC Controller.
 * @RequestMapping: Declares a URL for a action method in controller class
 * @RequestParam: To read single field from form data /query String 
 * @ModelAttribute: To read Multiple field from formdata /queryString
 *
 *ModelAndView :A ready spring object which holds the data model and view name.
 *The action method expected to populate this object with model and view and return to front controller 
 *this front controller register data with request and does dispatching to view
 */
@Controller
public class HrController {
	
	@Autowired
	private EmpServices empService;
	
	@RequestMapping("*.do")
	public String getHomePage() {
		return "Home";
	}
	
	@RequestMapping("login.do")
	public String getLoginPage() {
		return "Login";
	}
	
	/*
	 * @RequestMapping("authenticate.do") public String
	 * autheticateUser(HttpServletRequest req) { String
	 * userNm=req.getParameter("userNm"); String
	 * passWd=req.getParameter("password"); System.out.println(userNm+" "+passWd);
	 * return "MainMenu";
	 * 
	 * }
	 * 
	 */	
	/*
	 * @RequestMapping("authenticate.do") public String autheticateUser(
	 * 
	 * @RequestParam("userNm") String userNm,
	 * 
	 * @RequestParam("password") String passWd) {
	 * //System.out.println(userNm+" "+passWd); boolean
	 * isValidUser=empService.isAuthenticated(userNm, passWd); if(isValidUser)
	 * return "MainMenu"; else return "Login";
	 * 
	 * }
	 */
	@RequestMapping("authenticate.do")
	public ModelAndView autheticateUser(
		@RequestParam("userNm") String userNm,
		@RequestParam("password") String passWd) {
		//System.out.println(userNm+" "+passWd);
		boolean isValidUser=empService.isAuthenticated(userNm, passWd);
		ModelAndView mAndV=new ModelAndView();
		
		if(isValidUser) {
			mAndV.setViewName("MainMenu");
			return mAndV;
		}
		else {
			mAndV.setViewName("Login");
			mAndV.addObject("errorMsg","Login unsuccessful may be for wrong credential");
			return mAndV;
		
		}
			
	}
	
	@RequestMapping("empList.do")
	public ModelAndView getEmployeeList() {
		ArrayList<Employee> empList = null;
		try {
			empList = empService.getEmpList();
		} catch (HrException e) {
	        e.printStackTrace();
		}
		ModelAndView mAndV=new ModelAndView();
		mAndV.addObject("empList",empList);
		mAndV.setViewName("EmpList");
		return mAndV;
		
		
	}


}
