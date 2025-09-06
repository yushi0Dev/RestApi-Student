package com.api.crud.controller;

import java.util.List;

import com.api.entities.Student;

public interface IStudentController {
	
	public Student createStudent(Student student);
	public List<Student> studentList();
	public boolean deleteStudent(Integer id);
	public Student updateStudent(Integer id,Student student);
	public Student studentfindById(Integer id);
}
