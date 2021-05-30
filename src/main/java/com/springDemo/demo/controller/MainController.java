package com.springDemo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@GetMapping
	String HelloWorld() {
		return "Hello World";
	}
		
		@GetMapping("Print/{First_Name}")
		String APIWorld(@PathVariable(name = "First_Name")String name) {
			return name;	
		}
  @PostMapping(" name=/Post")
   void PrintMyStatement() {
	  System.out.println("This is a API");
  }
   @GetMapping("Print")
   String APIWorldWithPathVariableParams(@RequestParam(name = "first_name")String name) {
	   System.out.println(name);
	   return "Hello World"+name;
   }
   @PostMapping(path="post2")
   void PrintMyStatement1(@RequestBody String name) {
	   System.out.println(name);
   }
}


