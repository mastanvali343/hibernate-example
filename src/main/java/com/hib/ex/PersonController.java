package com.hib.ex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@GetMapping("/hello")
	public Person sayHello() {
		return new Person(1l, "mastan", 29);
	}
}
