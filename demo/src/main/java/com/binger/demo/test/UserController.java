package com.binger.demo.test;

import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(value="",method=RequestMethod.POST)
	public User save(@RequestBody User user){
		user.id = UUID.randomUUID().toString();
		return user;
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public User get(@PathVariable String id){
		User user = new User();
		user.balance = new BigDecimal("3.2");
		user.id = id;
		user.name = "小明";
		return user;
	}
	
	@RequestMapping(value="",method=RequestMethod.PUT)
	public User update(@RequestBody User user){
		return user;
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public String delete(@PathVariable String id){
		return "success";
	}
}
