package com.dennislee.products.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dennislee.products.models.Category;
import com.dennislee.products.models.Product;
import com.dennislee.products.repositories.CategoryRepository;
import com.dennislee.products.repositories.ProductRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository cRepo;
	
	@Autowired
	private ProductRepository pRepo;
	
	public Category getCategory(Long id) {
		Category set = this.cRepo.findById(id).orElse(null);
		return set;
	}
	
	public List<Category> getAllCategory(){
		return this.cRepo.findAll();
	}
	
	public Category createCategory(Category category) {
		return this.cRepo.save(category);
	}
	
	public void deleteCategory(Long id) {
		this.cRepo.deleteById(id);
	}
	
	public Category updateCategory(Category category) {
		return this.cRepo.save(category);
	}
	
	//Add Product to Category
	public void addProduct(Product product, Category category) {
		// get the list from the pet
		List<Product> products = category.getProducts();
		
		// Add the product
		products.add(product);
		
		// Update Database
		this.cRepo.save(category);
	}
	
	public List<Product> getProducts(){
		return this.pRepo.findAll();
	}
}
