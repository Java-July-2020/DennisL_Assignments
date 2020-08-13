package com.dennislee.products.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dennislee.products.models.Product;
import com.dennislee.products.repositories.CategoryRepository;
import com.dennislee.products.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository pRepo;
	
	@Autowired
	private CategoryRepository cRepo;
	
	public Product getProducty(Long id) {
		Product set = this.pRepo.findById(id).orElse(null);
		return set;
	}
	
	public List<Product> getAllProduct(){
		return this.pRepo.findAll();
	}
	
	public Product createProduct(Product product) {
		return this.pRepo.save(product);
	}
	
	public void deleteProduct(Long id) {
		this.pRepo.deleteById(id);
	}
	
	public Product updateProduct(Product product) {
		return this.pRepo.save(product);
	}
}
