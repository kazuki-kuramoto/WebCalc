package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexControllers {
	@RequestMapping("calc")
	public String calc() {
		return "calc";
	}
}
