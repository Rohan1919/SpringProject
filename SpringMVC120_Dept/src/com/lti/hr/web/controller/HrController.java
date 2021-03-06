package com.lti.hr.web.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.hr.core.entities.Department;
import com.lti.hr.core.exception.HrException;
import com.lti.hr.core.services.DeptService;

@Controller
public class HrController {
	@Autowired
	private DeptService deptService;
	@RequestMapping("menu.do")
	public String getMainMenu() {
		return "MainMenu";
	}
	
	@RequestMapping("deptlist.do")
	public ModelAndView getDeptList() {
		ModelAndView mAV=new ModelAndView();
		ArrayList<Department> deptList=null;
		try {
			deptList=deptService.getDeptList();
		} catch (HrException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mAV.addObject("deptList",deptList);
		mAV.setViewName("DeptList");
		return mAV;
		
	}
	@RequestMapping("entryDept.do")
	public String getEntryPage() {
		return "Entry";
	}
	@RequestMapping("createDept.do")
	public ModelAndView createNewDepartment(
			@RequestParam("deptId") int deptId,
			@RequestParam("deptNm") String deptNm,
			@RequestParam("deptLoc") String deptLoc) {
		
		ModelAndView mAndV=new ModelAndView();
		Department dept=new Department(deptId,deptNm,deptLoc);
		
		boolean isInserted=false;
		try {
			isInserted = deptService.createNewDepartment(dept);
		} catch (HrException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(isInserted) {
			mAndV.addObject("msg","department created succefully..");
			mAndV.setViewName("SuccessInsert");
		}
		else {
			mAndV.addObject("msg","department created failed..");
			mAndV.setViewName("Entry");
		}
		return mAndV;
	}

}
