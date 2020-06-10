package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmpRepository;

@Service
public class EmpService {
@Autowired
EmpRepository empRepository;
	public List<Employee> getAll() {
		return empRepository.getAll();
	}
	public String add(Employee emp) {
		 
		// TODO Auto-generated method stub
		return empRepository.add(emp);
	}
	public String edit(Employee emp) {
		return empRepository.edit(emp);
	}
	public String delete(int empNo) {
		return empRepository.delete(empNo);
	}

}
