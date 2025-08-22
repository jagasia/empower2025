package com.empower.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empower.demo.entity.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {

}
