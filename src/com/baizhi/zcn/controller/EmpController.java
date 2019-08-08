package com.baizhi.zcn.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baizhi.zcn.entity.Emp;
import com.baizhi.zcn.service.EmpService;

@Controller
@RequestMapping("/emp")
public class EmpController {

	@Autowired
	private EmpService empService;
	private HashMap<String, Object> map = new HashMap<String,Object>();
	
	@RequestMapping("queryAll")
	@ResponseBody
	public HashMap<String, Object> queryAll(){
		
		List<Emp> emps = empService.qureyAll();
		map.put("success", emps);
		map.put("message", 200);
		
		return map;
	}
	
}
