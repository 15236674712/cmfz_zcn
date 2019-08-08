package com.baizhi.zcn.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baizhi.zcn.dao.EmpDao;
import com.baizhi.zcn.entity.Emp;
import com.baizhi.zcn.service.EmpService;

@Service
@Transactional
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	private EmpDao empDao;
	
	@Override
	public List<Emp> qureyAll() {
		
		List<Emp> emps = empDao.queryAll();
		
		return emps;
	}

}
