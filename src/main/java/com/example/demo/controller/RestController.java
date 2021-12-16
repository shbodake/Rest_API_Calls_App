package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/hello")
/*
 * @RestController:to create the rest controller class.
 * @RequestMapping:describe the URL.
 * @RequestParam:to pass the value as parameter.
 */

public class RestController 
{
	 @RequestMapping(value = {"", "/", "home"})
	    public String sayHello() {
	        return "Hello From Bridgelabz..";
	    }
	 
	 @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
	    public String sayHello(@RequestParam(value= "name")String name){
	        return "Hello "+ name +" From Bridgelabz";
	    }
}
