package com.willy.mapper;

import java.time.LocalDate;
import java.util.List;

import org.apache.ibatis.annotations.*;

import com.willy.pojo.Emp;

@Mapper
public interface EmpMapper {
	
	
	
	@Delete("delete from emp where id = #{id}")
	public void delete(Integer id);
	
	@Options(keyProperty = "id", useGeneratedKeys = true)
	
	@Insert("insert into emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time)" + "values (#{username},#{name},#{gender}, #{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime})")
	public void insert(Emp emp);
	
	@Update("update emp set username = #{username}, name = #{name}, gender = #{gender}, image = #{image}, job = #{job}, entrydate = #{entrydate}, dept_id = #{deptId}, update_time = #{updateTime} where id = #{id} ")
	public void update(Emp emp);
	
	@Select("select * from emp where id = #{id}")
	public Emp getById(Integer id);
	
	@Select("select * from emp where name like concat('%', #{name}, '%') and gender = #{gender} and entrydate between #{begin} and #{end} order by update_time desc")
	public List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);
	
}