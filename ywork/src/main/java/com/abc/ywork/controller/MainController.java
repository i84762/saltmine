package com.abc.ywork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author amrit
 * 
 */
@Controller
public class MainController
{
	@RequestMapping("/")
	public ModelAndView getHome(ModelAndView view)
	{
		view.setViewName("login");
		return view;
	}
}
