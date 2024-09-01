package com.willy;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.willy.mapper.EmpMapper;
import com.willy.pojo.Emp;

@SpringBootTest
class MybatisUpdateTest {

	@Autowired
	private EmpMapper empMapper;

	@Test
	public void testUpdate() {
		Emp emp = new Emp();

		emp.setId(1);
		emp.setUsername("Tom2");
		emp.setName("湯姆5566");
		emp.setImage("2.jpg");
		emp.setGender((short) 1);
		emp.setJob((short) 2);
		emp.setEntrydate(LocalDate.of(2024, 8, 1));
		emp.setUpdateTime(LocalDateTime.now());
		emp.setDeptId(1);

		empMapper.update(emp);

	}
}