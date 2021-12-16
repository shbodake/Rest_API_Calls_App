package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @Controller:indicate the class is a Spring controller
 * @RequestMapping:describes the URL.
 */
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/hello")
public class RestController {
	 @RequestMapping(value = {"", "/", "home"})
	    public String sayHello() {
	        return "Hello From Bridgelabz..";
	    }

}
