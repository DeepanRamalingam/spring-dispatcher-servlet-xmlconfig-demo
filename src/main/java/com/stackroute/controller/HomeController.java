package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.stackroute.model.User;

@Controller
public class HomeController {

	@RequestMapping(value = "/home",method = RequestMethod.GET)
	public String homeView() {
		
		return "home";
	}
	
	@RequestMapping(value = "/info",method = RequestMethod.GET)
	public String infoView(ModelMap map) {
		map.addAttribute("name", "Deepan Chakkaravarthy");
		map.addAttribute("position","Trainer");
		return "info";
	}
	
	@RequestMapping(value = "/process",method = RequestMethod.GET)
	public String processView1(@RequestParam("t1") String name,@RequestParam("t2") String position,ModelMap map) {
		map.addAttribute("name", name);
		map.addAttribute("position",position);
		return "info";
	}
	
	@RequestMapping(value = "/post/process",method = RequestMethod.POST)
	public ModelAndView processView2(@ModelAttribute("user") User user,ModelAndView mv) {
		String name = user.getName();
		String position = user.getPosition();
		mv.addObject("name",name);
		mv.addObject("position",position);
		mv.setViewName("info");
		return mv;
	}
}
