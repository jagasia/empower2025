package com.empower.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathsController {

	@GetMapping
	public String home() {
		return "index";
	}
	
	@GetMapping("/add")
//	@ResponseBody
	public String add(@RequestParam Integer no1,@RequestParam Integer no2, ModelMap model) {
		Integer sum=no1+no2;
		model.addAttribute("sum",sum);
		return "index";
	}
}
