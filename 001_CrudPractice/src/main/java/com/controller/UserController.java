package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Employee;
import com.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView model=new ModelAndView();
		model.addObject("data",userService.viewAllUser());
		model.setViewName("index");
		return model;
	}
	@RequestMapping("/home")
	public ModelAndView revhome()
	{
		ModelAndView model=new ModelAndView();
		model.addObject("data",userService.viewAllUser());
		model.setViewName("index");
		return model;
	}
	@RequestMapping("/userAdd")
	public ModelAndView addUser()
	{
		ModelAndView model=new ModelAndView();
		model.addObject("useradd", new Employee());
		model.setViewName("adduser");
		return model;
	}
	@RequestMapping(method = RequestMethod.POST, value = "/adduser")
	public ModelAndView addOrUpdateUser(@ModelAttribute("useradd")Employee employee)
	{
		ModelAndView model=new ModelAndView();
		userService.addUser(employee);
		model.setViewName("redirect:/");
		return model;
	}
	@RequestMapping("/singleUser")
	public ModelAndView singleUser(@RequestParam("sid")String user)
	{
		ModelAndView model=new ModelAndView();
		model.addObject("dt",userService.getEmployee(user));
		model.setViewName("userprofile");
		return model;
	}
	@RequestMapping("/updateUser")
	public ModelAndView updateUser(@RequestParam("uid")int id)
	{
		ModelAndView model=new ModelAndView();
		model.addObject("useradd",userService.getUserById(id));
		model.addObject("data",userService.viewAllUser());
		model.setViewName("adduser");
		return model;
	}
	@RequestMapping("/deleteUser")
	public ModelAndView deleteUser(@RequestParam("did")int id)
	{
		ModelAndView model=new ModelAndView();
		userService.deleteUser(id);
		model.addObject("data",userService.viewAllUser());
		model.setViewName("redirect:/");
		return model;
	}
}
