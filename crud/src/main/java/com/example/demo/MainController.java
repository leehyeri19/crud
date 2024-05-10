package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping(value="/main")
public class MainController {

	@GetMapping
	public String main() {
		return "index";
	}

	@GetMapping("/user")
	public String user() {
		return "user";
	}
}
