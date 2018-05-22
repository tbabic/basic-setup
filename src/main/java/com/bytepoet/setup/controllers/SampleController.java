package com.bytepoet.setup.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bytepoet.setup.resources.SampleResource;

@RequestMapping("/sample")
@RestController
public class SampleController {

	@RequestMapping(method = RequestMethod.GET)
	public SampleResource get() {
		return new SampleResource();
	}
}
