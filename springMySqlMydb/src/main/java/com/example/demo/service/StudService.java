package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repositoty.StudentRepo;

@Service
public class StudService {

	@Autowired
	private StudentRepo studentRepo;
	
	public List<Student> getAllStudents(){
		List<Student> students=new ArrayList<>();
		//studentRepo.findAll().forEach(students::add);
		students= studentRepo.findAll();
		return students;
	}
	
	public void addStudent(Student student) {
		studentRepo.save(student);
	}

	
}
