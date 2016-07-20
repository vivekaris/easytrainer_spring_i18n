/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.easytrainer.controller;



import javax.validation.Valid;

import org.easytrainer.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 * @author Vivek
 */
@Controller
public class HelloController {
		
	
			@RequestMapping(value = "/")
			public ModelAndView students() {
			ModelAndView modelAndView =new ModelAndView("userReg");
			return modelAndView;
			}
			
			@RequestMapping(value = "/register",method=RequestMethod.POST)
			public ModelAndView processStudnet(@Valid @ModelAttribute("u") User u,BindingResult result) {
			ModelAndView modelAndView = new ModelAndView();

			if (result.hasErrors()) {
				modelAndView.setViewName("userReg");
				}
				else {
				modelAndView.setViewName("userResult");
				}
				return modelAndView;
			}

   
    
  
}
