package com.dennislee.products.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dennislee.products.services.CategoryService;
import com.dennislee.products.services.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService pService;
	
	@Autowired
	private CategoryService cService;

	@RequestMapping("")
	public String products() {
		return "product.jsp";
	}
}
