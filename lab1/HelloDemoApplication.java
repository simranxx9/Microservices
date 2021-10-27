package com.example.helloDemo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class HelloDemoApplication {

	@RequestMapping("/")
	String home(){
		
		return "Home";
	}
	
    @RequestMapping("/name")
    String name() {
        return "Hi Simranjeet Singh";
    }
	@GetMapping("/hello1/{name}")
	public String hello1(@PathVariable("name") String name)
	{
		hello2(name);
		return "Hello " + name;
	}
	@GetMapping("/hello2")  
	
	public String hello2(@RequestParam(name="name", required = false, defaultValue = "CSE") String name)
	{
		return "Hello " + name;
	}
	@RequestMapping("/hello3")   
	public String hello3(@RequestParam(name = "id") String myId, @RequestParam String name) { 
		return "ID: " + myId + " Name: " + name;
	}
	public static void main(String[] args) {
		SpringApplication.run(HelloDemoApplication.class, args);
	}

}
