package com.dennislee.loginreg.services;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dennislee.loginreg.models.User;
import com.dennislee.loginreg.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository uRepo;
	
	public User findAUser(Long id) {
		User user = this.uRepo.findById(id).orElse(null);
		return user;
	}
	
	public List<User> findAllUsers(){
		return this.uRepo.findAll();
	}
	
	public User findByEmail(String email) {
		User user = this.uRepo.findByEmail(email);
		return user;
	}
	
	public User registerUser(User user) {
		// Generate a Hash
		String hash = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		
		// Set the hashed password on the users password field
		user.setPassword(hash);
		
		// Save the new user and the updated password to the database
		return this.uRepo.save(user);
	}
	
	public boolean authenticateUser(String email, String password) {
		// Make sure the user logging in is who they say they are
		// Try and query for user by email
		User user = this.uRepo.findByEmail(email);
		
		if (user == null) {
			return false;
		}
		
		// If we have reached this point, check the password against the password for this email in our database
		return BCrypt.checkpw(password, user.getPassword());
	}
	
	public User getByEmail(String email) {
		return this.uRepo.findByEmail(email);
	}
}
