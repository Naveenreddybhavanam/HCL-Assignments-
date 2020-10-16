package com.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;

@Controller
public class UserController {
	@GetMapping(value="/aa")
	public String loadPage(Model model) {
		User user = new User();
		model.addAttribute("key", user);
		return "Login";
	}
	@PostMapping(value="/login")
	public ModelAndView loginFunction(@Valid @ModelAttribute("key") User user,BindingResult result) {
		ModelAndView modelAndView;
		if(result.hasErrors())
		{
		return modelAndView = new ModelAndView("Login");
		}
		modelAndView = new ModelAndView("Loginsuccess");
		modelAndView.addObject("alias", user);
		return modelAndView;
		
	}
}
