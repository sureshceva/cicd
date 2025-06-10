package com.sddata.cicd.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sddata.cicd.model.User;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@PostMapping("/getall")
	public List<User> getAll() {
		List<User> users = List.of(new User(1, "Alice"), new User(2, "Bob"), new User(3, "Charlie"), new User(3, "Suresh"));
		return users;
	}

}
