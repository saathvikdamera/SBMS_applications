package com.Damera.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {
	
	@GetMapping("/welcome")
	public ModelAndView getMsg(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Welcome to springboot web app");
		mav.setViewName("index");
		return mav;
	}
	
	@GetMapping("/greet")
	public ModelAndView getGreetMsg(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Good evening....!!");
		mav.setViewName("index");
		return mav;
	}
	
	

}
