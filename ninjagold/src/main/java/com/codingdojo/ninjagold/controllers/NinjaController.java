package com.codingdojo.ninjagold.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NinjaController {

	
	private Random rand;
	public ArrayList<String> activities ;
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("moneyTotal") == null) {
			session.setAttribute("moneyTotal", 0);
			
			activities = new ArrayList<String>(Arrays.asList(""));
			session.setAttribute("activities", activities);
		}
		
		return "index.jsp";
	}

	@RequestMapping("/reset")
	public String reset(HttpSession session) {
	    session.invalidate();
	    return "redirect:/";
	}
		
	@SuppressWarnings("unchecked")
	@RequestMapping(path = "/process/{id}", method = RequestMethod.POST)
	public String process(@PathVariable int id, HttpSession session) {
		rand       			= new Random();
		Date date 			= new Date();
		
		activities 			= (ArrayList<String>) session.getAttribute("activities");
		int moneyTotal  	= 0;
		int money			= 0;
		String activity 	= "";
		String[] locations 	= {"Grow-Op", "Bordello","Dojo","Ca$ino","Spa"};
		String activity1	= "Raided the %s and took %d gold coins [%tc]." ;
		
		switch(id) {
			case 1:
				money 	 	= rand.nextInt(10)+10;
				activity 	= String.format(activity1, locations[0], money, date);
				break;
				
			case 2:
				money 		= rand.nextInt(5)+5;
				activity 	= String.format(activity1, locations[1], money, date);
				break;
				
			case 3:
				money 		= rand.nextInt(3)+2;
				activity 	= String.format(activity1, locations[2], money, date);
				break;
				
			case 4:
				money 		= rand.nextInt(100)-50;
				if(money < 0){
					activity = String.format("Raided the %s and lost %d gold coins [%tc].", locations[3], money, date);
				} else{
					activity = String.format("Raided the %s and won %d gold coins [%tc].", locations[3], money, date);
				}			
				break;
				
			case 5:
				money 		= rand.nextInt(15)-20;
				activity 	= String.format("Raided the %s and spent %d gold coins [%tc].", locations[4], money, date);
				break;
		}
		
		//System.out.println("moneyTotal is: "+session.getAttribute("moneyTotal"));
		moneyTotal += (Integer) session.getAttribute("moneyTotal") + money;
		session.setAttribute("moneyTotal", moneyTotal);

		activities.add(activity);
		session.setAttribute("activities", activities);
	//	System.out.println("Activity is: "+session.getAttribute("activities")+"\n");
		
		return "redirect:/";
	}
	
	
	
}
