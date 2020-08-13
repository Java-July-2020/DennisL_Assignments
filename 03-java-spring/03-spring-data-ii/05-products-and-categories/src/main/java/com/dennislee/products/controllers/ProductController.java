package com.dennislee.products.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dennislee.products.models.Product;
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
	public String products(Model model) {
		List<Product> products = this.pService.getAllProduct();
		model.addAttribute("products", products);
		return "product.jsp";
	}
	
	@RequestMapping("/new")
	public String newProduct(@ModelAttribute("product") Product product, Model model) {
		model.addAttribute("product", product);
		return "newProduct.jsp";
	}
	
	@PostMapping("")
	public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult results, Model model) {
		if (results.hasErrors()) {
			return "newProduct.jsp";
		}
		else {
			this.pService.createProduct(product);
			return "redirect:/products";
		}
	}
}
