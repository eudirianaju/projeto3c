package com.example.projeto3c.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")

public class indexController {
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}

	@GetMapping("/home")
	public String home() {
		return "home";
		}
	
	@GetMapping("/main")
	public String main() {
		return "main";
		}
}
