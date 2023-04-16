package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBootxmlConfigApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootSpringBootxmlConfigApplication.class, args);
		
		//Ioc container
		//BeanFactory
		//ApplicationContext interface
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//Vehicle car=new Car();
		//Vehicle bike =new Bike();
		
		//Vehicle obj= new Bike();		
		//obj.Run();
		
		//Vehicle obj = (Vehicle)context.getBean("car");
		//obj.Run();
		
		Tyre t = (Tyre)context.getBean("Tyre");
		System.out.println(t);
	
	}

}
