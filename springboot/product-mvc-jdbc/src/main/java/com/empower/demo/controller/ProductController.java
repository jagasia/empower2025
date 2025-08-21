package com.empower.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.empower.demo.model.Product;
import com.empower.demo.model.ProductDao;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductDao pdao;

	@GetMapping
	public ModelAndView showProductPage() {
		List<Product> products = pdao.read();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("product");
		mv.addObject("products", products);
		return mv;
	}

	@GetMapping("/select")
	public ModelAndView selectProduct(@RequestParam("id") Long id) {
		// using id, we find product. How?
		Product product = pdao.read(id);
		ModelAndView mv = showProductPage();
		mv.addObject("product", product);
		return mv;
	}

	@PostMapping(value = "/dml", params = "add")
	public ModelAndView addProduct(Product product) {
		// add a product to the product table
		pdao.create(product);
		return showProductPage();
	}

	@PostMapping(value = "/dml", params = "update")
//	@ResponseBody
	public ModelAndView updateProduct(Product product, ModelMap model) {
		// add a product to the product table
		pdao.update(product);
		return showProductPage();
	}

	@PostMapping(value = "/dml", params = "delete")
//	@ResponseBody
	public ModelAndView deleteProduct(Product product, ModelMap model) {
		// add a product to the product table
		pdao.delete(product.getId());
		return showProductPage();
	}
}
