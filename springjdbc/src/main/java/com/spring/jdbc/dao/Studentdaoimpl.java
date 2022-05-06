package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public class Studentdaoimpl implements Studentdao {

	private JdbcTemplate jdbcTemplate; // the thing is done through jdbcTemplate for either doing any of the operation.
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int insert(Student student) {
		// TODO Auto-generated method stub
		String query = "insert into student(id,name,city) values(?,?,?)";
		int r= this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	
	public int change(Student student) {
		// updating
		String query = "update student set name= ?, city = ? where id = ?";
		int r = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	public int delete(int studentId) {
		// deleting
		String query = "delete from student where id = ?";
		int r = this.jdbcTemplate.update(query,studentId);
		return r;
	}
	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
		String query = "select * from student where id = ?";
		RowMapper<Student> rowMapper = (RowMapper<Student>) new RowMapperimpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper , studentId);
		return student;
	}
	public List<Student> getAllStudent() {
		// Select multiple student
		String query = "select * from student";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperimpl());
		return students;
	}
	
}
