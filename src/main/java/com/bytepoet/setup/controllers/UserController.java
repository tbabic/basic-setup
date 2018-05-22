package com.bytepoet.setup.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/users")
@RestController
public class UserController {

	@RequestMapping(method = RequestMethod.GET)
	public void get() {
		
	}
}
