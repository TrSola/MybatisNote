package com.willy;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.willy.pojo.Emp;
import com.willy.mapper.EmpMapper;

@SpringBootTest
class MybatisInsertTest {

	@Autowired
	private EmpMapper empMapper;

	@Test
	public void testInsert() {
		Emp emp = new Emp();
		// IDE問題 可正常compile 無視set紅線
		emp.setUsername("Tom");
		emp.setName("湯姆");
		emp.setImage("1.jpg");
		emp.setGender((short) 1);
		emp.setJob((short) 1);
		emp.setEntrydate(LocalDate.of(2000, 1, 1));
		emp.setCreateTime(LocalDateTime.now());
		emp.setUpdateTime(LocalDateTime.now());
		emp.setDeptId(3);

		empMapper.insert(emp);

		System.out.println(emp.getId());

	}

}