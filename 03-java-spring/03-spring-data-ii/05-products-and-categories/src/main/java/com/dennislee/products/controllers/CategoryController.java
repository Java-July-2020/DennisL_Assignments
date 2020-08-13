package com.dennislee.products.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dennislee.products.services.CategoryService;
import com.dennislee.products.services.ProductService;

@Controller
@RequestMapping("/categories")
public class CategoryController {

	@Autowired
	private CategoryService cService;
	
	@Autowired
	private ProductService pService;
	
	@RequestMapping("")
	public String categories() {
		return "category.jsp";
	}
}
