package com.empower.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empower.demo.entity.Department;
import com.empower.demo.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository fr;
	
	public Department create(Department department) {
		return fr.save(department);
	}
	public List<Department> read() {
		return fr.findAll();
	}
	public Department read(Long id) {
		Optional<Department> temp = fr.findById(id);
		Department f=null;
		if(temp.isPresent()) {
			f=temp.get();
		}
		return f;
	}
	public Department update(Department department) {
		Department f = read(department.getId());
		if(f!=null) {
			f=department;
			fr.save(f);
		}
		return f;
	}
	public Department delete(Long id) {
		Department f=read(id);
		if(f!=null) {
			fr.delete(f);
//			fr.deleteById(id);
		}
		return f;
	}
	
}
