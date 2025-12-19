package com.Pritam44.DemoRestApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Pritam44.DemoRestApi.Exections.UserNotFundException;
import com.Pritam44.DemoRestApi.Service.UsersService;
import com.Pritam44.DemoRestApi.Users.User;

import jakarta.validation.Valid;

@RestController
public class UsersController {
	@Autowired
	UsersService userService;
	@GetMapping("/users")
	public List<User> retriveAllUsers(){
		return userService.findall();
	}
	
	@GetMapping("/users/{id}")
	public User retriveUser(@PathVariable int id){
		User user = userService.findUsers(id);
		if(user == null) {
			throw new UserNotFundException("User not found with id "+id);
		}
		return user;
	}
	@PostMapping("/users")
	public void createUser(@Valid @RequestBody User user) {
		userService.saveUser(user);
	}
	
	@DeleteMapping("/users/{id}")
	public String deleteUserByUser(@PathVariable int id){
		boolean me = userService.DeleteUser(id);
		if(!me) {
			throw new UserNotFundException("User not found with id "+id);
		}
		return "Sucessfully deleted"; 
	}
	

}
