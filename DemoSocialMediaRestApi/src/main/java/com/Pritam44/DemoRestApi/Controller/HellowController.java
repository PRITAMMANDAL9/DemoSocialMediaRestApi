package com.Pritam44.DemoRestApi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Pritam44.DemoRestApi.Dto.User;

@RestController
public class HellowController {
	@GetMapping(path ="/hellow")
	public String hellow() {
		return "Hellow World";
	}
	 @GetMapping(path ="/helloWorld")
	public HellowWorld hellowWorldController() {
		 return new HellowWorld("Hello World");
		
	}
	 @GetMapping(path ="/user")
	 public User UserDetailsController() {
		 return new User("pritam",23,"java backend");
	 }

}
