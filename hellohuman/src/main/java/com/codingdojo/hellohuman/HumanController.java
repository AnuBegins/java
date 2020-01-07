package com.codingdojo.hellohuman;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HumanController {

	@RequestMapping("index")
	public String index() {
		return "index.jsp";
	}

	@RequestMapping("")
	public String home(
			@RequestParam(value = "firstName", defaultValue = "Human") String firstName,
			@RequestParam(value = "lastName", defaultValue = "") String lastName) {

				return "Hello " + firstName + " " +  lastName+ "! Welcome to SpringBoot.";

	}


}


//http://localhost:8080/?firstName=Anu&lastName=Ram