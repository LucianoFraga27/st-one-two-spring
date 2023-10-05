package com.stoica.onetwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/hello")
public class Controller {

	@GetMapping
	public String hello ( ) {
		return "Hello Lucas";
	}
	
}
