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

import com.empower.demo.entity.Department;
import com.empower.demo.service.DepartmentService;

@RestController
@RequestMapping("/Department")
public class DepartmentController {
	@Autowired
	private DepartmentService fs;
	
	@PostMapping
	public Department create(@RequestBody Department department) {
		System.out.println(department);
		return fs.create(department);
	}
	
	@GetMapping
	public List<Department> read() {
		return fs.read();
	}
	
	@GetMapping("/{id}")
	public Department read(@PathVariable Long id) {
		return fs.read(id);
	}
	
	@PutMapping("/{id}")
	public Department update(@PathVariable Long id, @RequestBody Department department) {
		return fs.update(department);
	}
	
	@DeleteMapping("/{id}")
	public Department delete(@PathVariable Long id) {
		return fs.delete(id);
	}
	
}
