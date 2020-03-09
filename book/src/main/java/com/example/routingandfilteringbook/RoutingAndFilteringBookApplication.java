package com.example.routingandfilteringbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@SpringBootApplication
public class RoutingAndFilteringBookApplication {
	@RequestMapping(value = "/available")
	public Map<String, String> available() {
		Map<String, String> map = new HashMap<>();
		map.put("name", "111");
		map.put("age", "2222");
		return map;
	}

	@RequestMapping(value = "/checked-out")
	public String checkedOut() {
		return "Spring Boot in Action";
	}

	public static void main(String[] args) {
		SpringApplication.run(RoutingAndFilteringBookApplication.class, args);
	}

}

