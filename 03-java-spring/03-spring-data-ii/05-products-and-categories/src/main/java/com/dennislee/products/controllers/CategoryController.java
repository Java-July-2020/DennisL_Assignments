package com.dennislee.products.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@RequestMapping("/new")
	public String newCategory(@ModelAttribute("category") Category category, Model model) {
		model.addAttribute("category", category);
		return "newCategory.jsp";
	}
	
	@PostMapping("")
	public String createCategory(@Valid @ModelAttribute("category") Category category, BindingResult results, Model model) {
		if (results.hasErrors()) {
			return "newCategory.jsp";
		}
		else {
			this.cService.createCategory(category);
			return "redirect:/categories";
		}
	}
	
	@RequestMapping("/{id}")
	public String viewCategory(@PathVariable("id") Long id, Model model, @ModelAttribute("category") Category category) {
		model.addAttribute("category", cService.getCategory(id));
		return "showCategory.jsp";
	}
}