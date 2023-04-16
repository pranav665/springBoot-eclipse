package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudService;

@RestController
public class Studentcontroller {
	
	@Autowired
	private StudService studService;
	
	@GetMapping("/welcome")
	@ResponseBody
	public String welcome() {
		return "welcome to spring";
	}
	
	@RequestMapping(value= "/students",method = RequestMethod.GET)
	public List<Student> getAllStudents(){
		return studService.getAllStudents();
	}
	
	@RequestMapping( value="/students",method = RequestMethod.POST)
	public void addStudent(@RequestBody Student student) {
		studService.addStudent(student);
	}
}
