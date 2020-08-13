package com.dennislee.products.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dennislee.products.models.Category;
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
	public String categories(Model model) {
		List<Category> categories = this.cService.getAllCategory();
		model.addAttribute("categories", categories);
		return "category.jsp";
	}
}
