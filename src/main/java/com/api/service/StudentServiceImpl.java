package com.api.service;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.entities.Student;
import com.api.repository.IStudentRepository;

@Service
public class StudentServiceImpl implements IStudentService{

	
	@Autowired
	private IStudentRepository repository;

	@Override
	public Student createStudent(Student student) {
		return repository.save(student);
	}

	@Override
	public List<Student> studentList() {
		 return repository.findAll();
		 
		
	}

	@Override
	public boolean deleteStudent(Integer id) {
		Optional<Student> optional = repository.findById(id);
		if(optional.isPresent()) {
			Student student = optional.get();
			repository.delete(student);
			return true;
		}
		return false;
	}

	@Override
	public Student updateStudent(Integer id, Student student) {
	Optional<Student> optional = repository.findById(id);
	if(optional.isPresent()) {
		Student updatedStudent = optional.get();
		updatedStudent.setFirstname(student.getFirstname());
		updatedStudent.setLastname(student.getLastname());
		updatedStudent.setBirthday(student.getBirthday());
		return updatedStudent;
	}
	return null;
		
	}

	@Override
	public Student studentfindById(Integer id) {
		Optional<Student> optional = repository.findById(id);
		if(optional.isPresent()) {
			Student student = optional.get();
			return student;
		}
		return null;
		
	}

}
