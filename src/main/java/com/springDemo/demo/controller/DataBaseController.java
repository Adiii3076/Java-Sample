package com.springDemo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Adiii.di.model.User;
import com.Adiii.di.service.DatabaseService;

@RestController
@RequestMapping(path="/auth")
public class DataBaseController {
	@Autowired
	DatabaseService databaseservice;
	

	@PostMapping(path="/register")
	String register(@RequestBody User user) {
		databaseservice.register(user);
		System.out.println("You are doing Registraion"+user);
		return "You are doing Registraion" + user;
	}
}
