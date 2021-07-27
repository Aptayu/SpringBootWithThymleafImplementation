package com.thymleaf.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/about")
	public String about(Model m) {
		m.addAttribute("name", "Arpit");
		return "about";
//		about.html
	}

	@GetMapping("/example-loop")
	public String iterateHandler(Model model) {
		List<String> list = List.of("Arpit", "Ayush", "Papa");
		model.addAttribute("mylist", list);
		model.addAttribute("gender", "F");
		return "iterate";
	}

	@GetMapping("/service")
	public String fragmentExample(Model model) {
		model.addAttribute("title", "service controller");
		model.addAttribute("subtitle", LocalDateTime.now().toString());

		return "service";

	}
}
