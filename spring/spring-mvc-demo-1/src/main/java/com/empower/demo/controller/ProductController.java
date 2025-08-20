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
import org.springframework.web.bind.annotation.ResponseBody;

import com.empower.demo.model.Product;
import com.empower.demo.model.ProductDao;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductDao pdao;

//	@RequestMapping(method = RequestMethod.GET, value = "/show", params = "Add")
//	@GetMapping(value="/show", params="Add")
	@GetMapping
	public String showProductPage(ModelMap model) {
		List<Product> products = pdao.read();
		if(model.getAttribute("product")==null)
			model.addAttribute("product",new Product());
		
		model.addAttribute("products", products);
		return "product";
	}
	
	//remind me about ModelAndView
	
	@GetMapping("/select")
	public String selectProduct(@RequestParam("id")Long id, ModelMap model) {
		//using id, we find product. How?
		Product product = pdao.read(id);
		model.addAttribute("product", product);
		return showProductPage(model);
	}
	
	@PostMapping(value = "/dml", params = "add")
	public String addProduct(@Valid Product product, BindingResult br, ModelMap model) {
		//add a product to the product table
		if(br.hasErrors()) {
			
		}else {
			pdao.create(product);
		}
		return showProductPage(model);
	}
	
	@PostMapping(value = "/dml", params = "update")
//	@ResponseBody
	public String updateProduct(Product product, ModelMap model) {
		//add a product to the product table
		pdao.update(product);
		return showProductPage(model);
	}
	
	@PostMapping(value = "/dml", params = "delete")
//	@ResponseBody
	public String deleteProduct(Product product, ModelMap model) {
		//add a product to the product table
		pdao.delete(product.getId());
		return showProductPage(model);
	}
	
}
