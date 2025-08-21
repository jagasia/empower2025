package com.empower.demo.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MathsController {
	@Autowired
	private MessageSource ms;
	

	@GetMapping
	public String home(ModelMap model) {
		model.addAttribute("name",ms.getMessage("name", null, Locale.getDefault()));
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
