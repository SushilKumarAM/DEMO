package com.niit.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.UserDAOImpl;

@Controller
public class UserController 
{
	@Autowired
	UserDAOImpl userDAOImpl;
	
	
	@RequestMapping(value="/saveUser", method=RequestMethod.POST)
	public ModelAndView saveUser(@Valid @ModelAttribute("user") int user,BindingResult result)
	{
		ModelAndView mv=new ModelAndView();
		if(result.hasErrors())
		{
			mv.setViewName("register");
			return mv;
		}
		else
		{
			userDAOImpl.getUser(user);
			mv.setViewName("index");
			return mv;
			
			
		}
	}

}
