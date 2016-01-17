package com.EChallenge.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.EChallenge.model.hello;

@Controller
public class helloController {
	
	 @RequestMapping(value = "/hello", method = RequestMethod.GET)
	   public String printHello(ModelMap model) {
		 ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans.xml");

	      hello obj = (hello) context.getBean("hello");

	      
	      model.addAttribute("message", obj.getMessage());
	      return "index";
	   }

}
