package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;
import com.service.UserService;

@Controller
public class RegistartionController {
	@Autowired
	UserService userService;
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView model=new ModelAndView();
		model.setViewName("index");
		return model;
	}
	@RequestMapping("/home")
	public ModelAndView index() {
		ModelAndView model=new ModelAndView();
		model.setViewName("index");
		return model;
	}
	@RequestMapping("/userlogin")
	public ModelAndView login() {
		ModelAndView model=new ModelAndView();
		model.addObject("loginPro",new User());
		model.setViewName("login");
		return model;
	}
	@RequestMapping(value = "/loginuser",method = RequestMethod.POST)
	public ModelAndView loginuser(@ModelAttribute("loginPro") User login,HttpServletRequest req) {
		ModelAndView model=new ModelAndView();
		User user=userService.validate(login);
		if(user==null) {
			model.addObject("error", "Invalid UsernameOr Password");
			model.setViewName("login");
		}else {
			HttpSession session=req.getSession();
			session.setAttribute("user", user.getFirstname());
			model.setViewName("index");
		}
		return model;
	}
	@RequestMapping("/userLogout")
	public String logout(HttpServletRequest req) {
		
		HttpSession session=req.getSession(false);
		session.invalidate();
		
		return "index";
	}
	@RequestMapping("/userreg")
	public ModelAndView register() {
		ModelAndView model=new ModelAndView();
		model.addObject("user",new User());
		model.setViewName("registartion");
		return model;
	}
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	public ModelAndView regUser(@ModelAttribute("user") User user) {
		userService.register(user);
		return new ModelAndView("redirect:home","firstname",user.getFirstname());
	}
}
