	package com.willy;
	
	import java.util.Arrays;
	import java.util.List;
	
	import org.junit.jupiter.api.Test;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.test.context.SpringBootTest;
	
	import com.willy.mapper.EmpMapper;
	
	@SpringBootTest
	public class MybatisSearchTest {
	
		@Autowired
		private EmpMapper empMapper;
		
		@Test
		public void testDelete() {
			List<Integer> ids = Arrays.asList(20, 21, 15);
			empMapper.deleteByIDs(ids);
		}
	}