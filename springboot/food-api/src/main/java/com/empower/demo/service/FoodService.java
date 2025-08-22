package com.empower.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empower.demo.entity.Food;
import com.empower.demo.repository.FoodRepository;

@Service
public class FoodService {
	@Autowired
	private FoodRepository fr;
	
	public Food create(Food food) {
		return fr.save(food);
	}
	public List<Food> read() {
		return fr.findAll();
	}
	public Food read(Long id) {
		Optional<Food> temp = fr.findById(id);
		Food f=null;
		if(temp.isPresent()) {
			f=temp.get();
		}
		return f;
	}
	public Food update(Food food) {
		Food f = read(food.getId());
		if(f!=null) {
			f=food;
			fr.save(f);
		}
		return f;
	}
	public Food delete(Long id) {
		Food f=read(id);
		if(f!=null) {
			fr.delete(f);
//			fr.deleteById(id);
		}
		return f;
	}
	
}
