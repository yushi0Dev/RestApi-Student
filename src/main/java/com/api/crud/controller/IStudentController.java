package com.api.crud.controller;

import java.util.List;

import com.api.crud.studentdto.StudentDto;
import com.api.crud.studentdto.StudentDtoIU;
import com.api.entities.Student;

public interface IStudentController {
	
	public StudentDto createStudent(StudentDtoIU student);
	public List<StudentDto> studentList();
	public StudentDto deleteStudent(Integer id);
	public StudentDto updateStudent(Integer id,StudentDtoIU student);
	public StudentDto studentfindById(Integer id);
}
