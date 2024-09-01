package com.willy;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.willy.mapper.EmpMapper;
import com.willy.pojo.Emp;

@SpringBootTest
public class MybatisSearchTest {
	
	@Autowired 
	private EmpMapper empMapper;
	
	@Test
	public void testList() {
		List<Emp> empList = empMapper.list("張", (short)(1), LocalDate.of(1010, 1, 1), LocalDate.of(3000, 1, 1));
		System.out.println(empList);
	}
}
