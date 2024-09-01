package com.willy;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.willy.pojo.User;
import com.willy.mapper.UserMapper;

@SpringBootTest	
class MybatisApplicationTests {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testListUser() {
		List<User> userList = userMapper.list();
		userList.stream().forEach(user -> {
			System.out.println(user);
		});
	}

}