package com.willy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.willy.mapper.EmpMapper;
import com.willy.pojo.Emp;

@SpringBootTest
public class MybatisSelectTest {

	@Autowired
	private EmpMapper empMapper;
	
	@Test
	public void testGetById() {
		
		Emp emp = empMapper.getById(1);
		System.out.println(emp);
	}
}