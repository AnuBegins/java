package com.codingdojo.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class CounterController {
	
	public int counter = 0;
	
	@RequestMapping("")
	public String index(HttpSession session) {
		counter ++;
		session.setAttribute("count", counter);

		return "index.jsp";
	}
	
	
	@RequestMapping("counter")
	public String getCounter(HttpSession session) {
		session.getAttribute("count");
		
		return "counter.jsp";
	}

	
	@RequestMapping("countertwo")
	public String getCounterTwo(HttpSession session) {
		session.setAttribute("count",(Integer) session.getAttribute("count")+2);
		
		return "counterTwo.jsp";
	}
	
	
	
	@RequestMapping("reset")
	public String reset(HttpSession session){
		session.setAttribute("count",0);
		return "redirect:counter";
	}
	
	
}
