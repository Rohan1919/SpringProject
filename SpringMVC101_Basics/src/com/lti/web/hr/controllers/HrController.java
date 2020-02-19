package com.lti.web.hr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//http://localhost:8686/SpringMVC101_Basics/*.do
@Controller
public class HrController {
	
	@RequestMapping(name="*.do")
	public String getHomePage() {
		return "/WEB-INF/jsps/Home.jsp";
	}

}
