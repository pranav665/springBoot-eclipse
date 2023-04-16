package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Alien;
import com.example.demo.repository.AlienRepository;

@RestController //restcontroller can't resolve page on browser coz inbuit @responsebody 
public class mainController {

	@Autowired
	private AlienRepository alienRepository;
	
	
	@GetMapping("/file")
	@ResponseBody
	public String file() {
		return "NewFile.html";
	}
	
	@GetMapping("/home")//view jsp page on browser not showing coz restcontroller
	public String home() {
		return "home";
	}
	
	@GetMapping("/getAlien")
	public List<Alien> getAlien() {
		
		return alienRepository.findAll()  ;
	}
	
	@PostMapping("/saveAlien")
	public String saveAlien(@RequestBody Alien alien) {
		
		alienRepository.save(alien);
		return "new Alien added successfully"  ;
	}
	
	@GetMapping("/getById/{id}")
	public List<Alien> getById(@PathVariable int id){
		return alienRepository.findById(id);
	}

}
