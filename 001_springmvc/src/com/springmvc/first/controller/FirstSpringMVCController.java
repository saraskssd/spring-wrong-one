package com.springmvc.first.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller


public class FirstSpringMVCController {
	@RequestMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	@RequestMapping("/message")
		public String sendMessage(Model m) {
		m.addAttribute("myMessage", "Hi I am in kitchen");
			return "kitchen";
		}
	@RequestMapping("/supermessage")
		public ModelAndView sendingSuperMesage(ModelAndView ma) {
		ma.addObject("message", "Hello welcome to the world of excitement");
		ma.setViewName( "cartoon");
		return ma;
	}
	@RequestMapping("/empform")
	public ModelAndView showform() {
		return new ModelAndView("empform","command",new emp());
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("emp1") emp emp1) {
		System.out.println(emp1.getName()+" "+emp1.getSalary()+" "+emp1.getDesignation());;
		return new ModelAndView("redirect:/viewemp");
	}
	@RequestMapping("/viewemp")
	public ModelAndView viewemp() {
		 List<emp> list=new ArrayList<emp>();  
	        list.add(new emp(1,"rahul",35000f,"S.Engineer"));  
	        list.add(new emp(2,"aditya",25000f,"IT Manager"));  
	        list.add(new emp(3,"sachin",55000f,"Care Taker"));  
	          
	        return new ModelAndView("viewemp","list",list);  
		
	}
	}


