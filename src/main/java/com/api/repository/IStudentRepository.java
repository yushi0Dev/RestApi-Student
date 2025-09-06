package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.entities.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer>{

}
