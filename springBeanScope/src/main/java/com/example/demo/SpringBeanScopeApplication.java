package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.model.Person;

@SpringBootApplication
public class SpringBeanScopeApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBeanScopeApplication.class, args);
		
		ApplicationContext context= new AnnotationConfigApplicationContext(Person.class);
		
		Person person= (Person)context.getBean(Person.class);		
		person.setName("pranav");
		System.out.println(person.getName());
		
		Person person2 = (Person)context.getBean(Person.class);
		System.out.println(person2.getName());
	}

}
