package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmpRepository;

@SpringBootApplication
public class FirstappSpringboot1Application implements CommandLineRunner {
@Autowired
EmpRepository empRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstappSpringboot1Application.class, args);
		//System.out.println("Spring  FirstAPP");
	}
	@Override
	public void run(String... args) throws Exception {
		Employee e1 = new Employee(1,"bharathi","rajampet");
		Employee e2 = new Employee(2,"bujji","kadapa");
empRepository.employee.addAll(Arrays.asList(e1,e2));
	}

}
