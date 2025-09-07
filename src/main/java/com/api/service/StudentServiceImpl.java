package com.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.crud.studentdto.StudentDto;
import com.api.crud.studentdto.StudentDtoIU;
import com.api.entities.Student;
import com.api.repository.IStudentRepository;

@Service
public class StudentServiceImpl implements IStudentService{

	
	@Autowired
	private IStudentRepository repository;

	@Override
	public StudentDto createStudent(StudentDtoIU student) {
		Student entity = new Student();
		BeanUtils.copyProperties(student, entity);
		Student savedStudent = repository.save(entity);
		StudentDto dto = new StudentDto();
		BeanUtils.copyProperties(savedStudent, dto);
		return dto;
		
		
	}

	@Override
	public List<StudentDto> studentList() {
		 List<Student> students = repository.findAll();
		 List<StudentDto> studentDtos = new ArrayList<>();
		 for (Student student : students) {
			StudentDto dto = new StudentDto();
			BeanUtils.copyProperties(student, dto);
			studentDtos.add(dto);
		}
		 return studentDtos;
	}

	@Override
	public StudentDto deleteStudent(Integer id) {
		Optional<Student> optional = repository.findById(id);
		if(optional.isPresent()) {
			Student student = optional.get();
			repository.delete(student);
			StudentDto dto = new StudentDto();
			BeanUtils.copyProperties(student, dto);
			return dto;
		}
		return null;
	}

	@Override
	public StudentDto updateStudent(Integer id, StudentDtoIU student) {
	Optional<Student> optional = repository.findById(id);
	if(optional.isPresent()) {
		Student updatedStudent = optional.get();
		
		updatedStudent.setFirstname(student.getFirstname());
		updatedStudent.setLastname(student.getLastname());
		updatedStudent.setBirthday(student.getBirthday());
		repository.save(updatedStudent);
		
		StudentDto dto = new StudentDto();
		BeanUtils.copyProperties(updatedStudent, dto);
		
		return dto;
	}
	return null;
	}

	@Override
	public StudentDto studentfindById(Integer id) {
		Optional<Student> optional = repository.findById(id);
		if(optional.isPresent()) {
			Student student = optional.get();
			StudentDto dto = new StudentDto();
			BeanUtils.copyProperties(student, dto);
			return dto;
		}
		return null;
		
	}

}
