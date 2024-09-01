package com.willy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.willy.mapper.EmpMapper;

@SpringBootTest	
class MybatisDeleteTest {

	@Autowired
	private EmpMapper empMapper;
	
	@Test
	public void testDeleteEmp() {
		empMapper.delete(19);
	}

}