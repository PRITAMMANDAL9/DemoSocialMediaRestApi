package com.Pritam44.DemoRestApi.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Pritam44.DemoRestApi.Exections.UserNotFundException;
import com.Pritam44.DemoRestApi.Repository.UsersRepository;
import com.Pritam44.DemoRestApi.Service.UsersService;
import com.Pritam44.DemoRestApi.entity.User;

import jakarta.validation.Valid;

@RestController
public class UsersController {
	@Autowired
	UsersService userService;
	@Autowired
	UsersRepository usersRepository ;
	
	@GetMapping("/users")
	public List<User> retriveAllUsers(){
		return usersRepository.findAll();
	}
	
	@GetMapping("/users/{id}")
	public Optional<User> retriveUser(@PathVariable int id){
		Optional<User> user = usersRepository.findById(id);
		if(user.isEmpty()) {
			throw new UserNotFundException("User not found with id "+id);
		}
		return user;
	}
	@PostMapping("/users")
	public void createUser(@Valid @RequestBody User user) {
		usersRepository.save(user);
	}
	
	@DeleteMapping("/users/{id}")
	public String deleteUserByUser(@PathVariable int id){
	usersRepository.deleteById(id);
//		if(!me) {
//			throw new UserNotFundException("User not found with id "+id);
//		}
		return "Sucessfully deleted"; 
	}
	

}
