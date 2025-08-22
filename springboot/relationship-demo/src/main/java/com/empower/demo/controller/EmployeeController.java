package com.empower.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empower.demo.entity.Employee;
import com.empower.demo.service.EmployeeService;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	@Autowired
	private EmployeeService fs;
	
	@PostMapping
	public Employee create(@RequestBody Employee employee) {
		System.out.println(employee);
		return fs.create(employee);
	}
	
	@GetMapping
	public List<Employee> read() {
		return fs.read();
	}
	
	@GetMapping("/{id}")
	public Employee read(@PathVariable Long id) {
		return fs.read(id);
	}
	
	@PutMapping("/{id}")
	public Employee update(@PathVariable Long id, @RequestBody Employee employee) {
		return fs.update(employee);
	}
	
	@DeleteMapping("/{id}")
	public Employee delete(@PathVariable Long id) {
		return fs.delete(id);
	}
	
}
