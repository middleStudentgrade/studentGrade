package com.middleschool.grade.web.controller;

import com.middleschool.grade.common.dto.MgStudent;
import com.middleschool.grade.common.service.TestService;
import org.apache.ibatis.io.ResolverUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {
	@Autowired
	private TestService testService;

	@RequestMapping("/")
	public String showIndex(){
		return "index";
	}
	
	@RequestMapping("/menu/{module}/{page}")
	public String showPage(@PathVariable String module, @PathVariable String page){
		return module+"/"+page;
	}

	@RequestMapping("/test")
	public String test(){
		MgStudent student=new MgStudent();
		student.setName("hhh");
		student.setStudentNum(2012221328L);
		testService.saveTest(student);
		return "success";
	}
	
	
}
