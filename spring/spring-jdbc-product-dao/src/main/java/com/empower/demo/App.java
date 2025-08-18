package com.empower.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.empower.demo.config.MyConfiguration;
import com.empower.demo.dao.ProductDao;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfiguration.class);
		ProductDao pdao=(ProductDao) ctx.getBean("pdao");
//		List<Product> products = pdao.read();
//		for(Product p:products) {
//			System.out.println(p);
//		}
		
//		 Product p = pdao.read(2L);
//		 System.out.println(p);
		

//		int no = pdao.create(new Product(111L, "My Product", "My Category", 1000.0));
//		int no=pdao.update(new Product(111L, "My Product", "My Category", 10.0));
//		int no=pdao.delete(111L);
//		System.out.println(no);
	}

}
