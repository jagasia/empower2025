package com.empower.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.empower.demo.entity.Product;
import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>
{
	List<Product> findByCategory(String category);
	
	@Query("select p from Product p where p.price between :x and :y")
	List<Product> findByPriceRange(@Param("x") Double x,@Param("y") Double y);
//	
//	@Query(value="select * from PROD p where p.price between :x and :y", nativeQuery=true)
//	List<Product> findByPriceRange(@Param("x") Double x,@Param("y") Double y);
	
	
	
}
