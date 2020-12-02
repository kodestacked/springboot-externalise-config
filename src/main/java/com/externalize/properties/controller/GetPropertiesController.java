package com.externalize.properties.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.externalize.properties.PropertiesResolver;

@RestController
public class GetPropertiesController {

	@Autowired
	private PropertiesResolver prop;

	@GetMapping("greetings")
	public ResponseEntity<String> getGreeting() {
		String data = prop.getSpringBootGreetings();
		System.out.println(data);
		System.out.println(prop.getTextValue());
		return ResponseEntity.ok(data);
	}
}
