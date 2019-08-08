package com.baizhi.zcn.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baizhi.zcn.dao.EmpDao;
import com.baizhi.zcn.entity.Emp;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestEmp {

	@Resource
	private EmpDao empDao;
	
	@Test
	public void TestQuery(){
		
		List<Emp> emps = empDao.queryAll();
		for (Emp emp : emps) {
			System.out.println(emp);
		}
	}
}
