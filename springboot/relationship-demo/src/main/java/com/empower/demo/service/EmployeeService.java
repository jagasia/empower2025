package com.empower.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empower.demo.entity.Employee;
import com.empower.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository fr;
	
	public Employee create(Employee employee) {
		return fr.save(employee);
	}
	public List<Employee> read() {
		return fr.findAll();
	}
	public Employee read(Long id) {
		Optional<Employee> temp = fr.findById(id);
		
		Employee f=null;
		if(temp.isPresent()) {
			f=temp.get();
		}
		return f;
	}
	public Employee update(Employee employee) {
		Employee f = read(employee.getId());
		
		if(f!=null) {
			f=employee;
			fr.save(f);
		}
		return f;
	}
	public Employee delete(Long id) {
		Employee f=read(id);
		if(f!=null) {
			fr.delete(f);
//			fr.deleteById(id);
		}
		return f;
	}
	
}
