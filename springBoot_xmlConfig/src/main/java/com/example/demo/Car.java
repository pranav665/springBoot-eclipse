package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

	 public void Run() {
		System.out.println("Car is driving");
	}
}
