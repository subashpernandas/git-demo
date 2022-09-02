package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HomeController {

	@GetMapping
	public String getReturnValue() {
		if("subash.p".equals("subash.p")) {
			return "subash pernandas";
		}
		else {
			return "pernndas savari";
		}
	}
}
