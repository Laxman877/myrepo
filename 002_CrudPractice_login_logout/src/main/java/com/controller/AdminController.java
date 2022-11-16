package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Admin;
import com.model.Student;
import com.service.AdminService;
import com.service.StudentService;

@Controller
public class AdminController {
	@Autowired
	AdminService adminService;
	@Autowired
	StudentService studentService;
	@RequestMapping("/")
	public ModelAndView adminHome()
	{
		ModelAndView model=new ModelAndView();
		model.addObject("adminlogpro",new Admin());
		model.setViewName("adminlogin");
		return model;
	}
	@RequestMapping("/loginpage")
	public ModelAndView adminlogin()
	{
		ModelAndView model=new ModelAndView();
		model.addObject("adminlogpro",new Admin());
		model.setViewName("adminlogin");
		return model;
	}
	@RequestMapping("/studentAdd")
	public ModelAndView studentAdd()
	{
		ModelAndView model=new ModelAndView();
		model.addObject("studentadd",new Student());
		model.setViewName("studentReg");
		return model;
	}
	@RequestMapping(method = RequestMethod.POST, value = "/addstudent")
	public ModelAndView studentReg(@ModelAttribute("studentadd") Student student)
	{
		ModelAndView model=new ModelAndView();
		studentService.addOrUpdateStd(student);
		model.addObject("msg","Registration Successfull..");
		model.setViewName("redirect:studentAdd");
		return model;
	}
	@RequestMapping(value = "/adminlog",method = RequestMethod.POST)
	public ModelAndView adminLogin(@ModelAttribute("adminlogpro") Admin adlogin,HttpServletRequest req) {
		ModelAndView model=new ModelAndView();
		Admin admin=studentService.adminValidate(adlogin);
		if(admin==null) {
			model.addObject("error","Invalid UserName Or Password..");
			model.setViewName("adminlogin");
		}else {
			HttpSession session=req.getSession();
			session.setAttribute("email", admin.getUsername());
			model.addObject("data",studentService.getAllUser());
			model.setViewName("admindashboard");
		}
		return model;
	}
	@RequestMapping("/addshow")
	public ModelAndView admindash()
	{
		ModelAndView model = new ModelAndView();
		model.addObject("data",studentService.getAllUser());
		model.setViewName("admindashboard");
		return model;
	}
	@RequestMapping("/updateUser")
	public ModelAndView updateStudent(@RequestParam("uid") int id)
	{
		ModelAndView model=new ModelAndView();
		model.addObject("studentadd",studentService.getById(id));
		model.setViewName("studentReg");
		return model;
	}
	@RequestMapping("/deleteUser")
	public ModelAndView deleteStudent(@RequestParam("did")int id)
	{
		ModelAndView model=new ModelAndView();
		studentService.deleteStd(id);
		model.setViewName("redirect:addshow");
		return model;
	}
	@RequestMapping("/adminlogout")
	public ModelAndView adminLogout(HttpServletRequest req)
	{
		ModelAndView model=new ModelAndView();
		HttpSession session=req.getSession();
		session.invalidate();
		model.setViewName("redirect:loginpage");
		return model;
	}
}
