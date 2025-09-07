package com.api.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.crud.studentdto.StudentDto;
import com.api.crud.studentdto.StudentDtoIU;
import com.api.entities.Student;
import com.api.service.IStudentService;

@RestController
@RequestMapping(path = "/student")
public class StudentControllerImpl implements IStudentController{
	
	@Autowired
	private IStudentService service;

	@Override
	@PostMapping(path = "/create")
	public StudentDto createStudent(@RequestBody StudentDtoIU student) {
		return service.createStudent(student);
	}

	@Override
	@GetMapping(path = "/list")
	public List<StudentDto> studentList() {
		return service.studentList();
	}

	@Override
	@DeleteMapping(path = "/delete/{id}")
	public StudentDto deleteStudent(@PathVariable("id") Integer id) {
		return service.deleteStudent(id);
	}

	@Override
	@PutMapping(path = "/update/{id}")
	public StudentDto updateStudent(@PathVariable("id") Integer id,@RequestBody StudentDtoIU student) {
		return service.updateStudent(id, student);
	}

	@Override
	@GetMapping(path = "/find/{id}")
	public StudentDto studentfindById(@PathVariable("id") Integer id) {
		return service.studentfindById(id);
	}
	
	
	

}
