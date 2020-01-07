package com.codingdojo.dojosurvey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SurveyController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp" ;
	}
	
	
	@RequestMapping("/submission")
	public String displaySubmission() {
		return "submission.jsp" ;
	}
	
	
	@RequestMapping(value = "/process", method = RequestMethod.POST)
	public String process(@RequestParam(value 	= "name") String name,
							@RequestParam(value = "location") String loc,
							@RequestParam(value = "language") String lang,
							@RequestParam(value = "comment", defaultValue = "") String comment, HttpSession session) {
		session.setAttribute("name", name);
		session.setAttribute("location", loc);
		session.setAttribute("language", lang);
		session.setAttribute("comment", comment);
		
		return "redirect:/submission" ;
		
	}

}
