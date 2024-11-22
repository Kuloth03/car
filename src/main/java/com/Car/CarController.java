package com.Car;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CarController {

	
	@GetMapping(value ="/first")
	public String method()
	{
		return "JENKINS";
	}
}
