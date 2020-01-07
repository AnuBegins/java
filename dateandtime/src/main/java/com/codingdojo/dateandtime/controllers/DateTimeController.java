package com.codingdojo.dateandtime.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class DateTimeController {

	@RequestMapping("")
	public String index() {
		return "Index.jsp";
	}

	@RequestMapping("date")
	public String getDate(Model model) {
		Date date 					= new Date();
		SimpleDateFormat formatter 	= new SimpleDateFormat("EEEE, 'the' dd 'of' MMMM, yyyy");
		model.addAttribute("formattedDate", formatter.format(date));
		return "Date.jsp";
	}

	@RequestMapping("time")
	public String getTime(Model model) {
		Date time 					= new Date();
		SimpleDateFormat formatter 	= new SimpleDateFormat("HH:mm:ss");
		model.addAttribute("formattedTime", formatter.format(time));

		return "Time.jsp";

	}

}
