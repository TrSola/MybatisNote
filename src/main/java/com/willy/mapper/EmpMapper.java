package com.willy.mapper;

import java.time.LocalDate;
import java.util.List;

import org.apache.ibatis.annotations.*;

import com.willy.pojo.Emp;

@Mapper
public interface EmpMapper {
	
	
	
//	@Delete("delete from emp where id = #{id}")
	public void deleteByIDs(List<Integer> ids);
	
	@Options(keyProperty = "id", useGeneratedKeys = true)
	
	@Insert("insert into emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time)" + "values (#{username},#{name},#{gender}, #{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime})")
	public void insert(Emp emp);
	
	public void update(Emp emp);
	
	@Select("select * from emp where id = #{id}")
	public Emp getById(Integer id);

	public List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);
}