package com.kandakatla.rs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping(path = "/hello-world/{name}")
	public String helloWorldPathVariable(@PathVariable String name) {
		return String.format("Hello World, %s", name); // %s replace the name
	}

}
