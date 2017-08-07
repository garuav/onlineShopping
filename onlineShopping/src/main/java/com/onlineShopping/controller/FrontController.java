package com.onlineShopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontController {

	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index()
	{
		
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("greetings","Welcome Mr.Gaurav " );
		return mv;
	}
	
	// @RequestParam use
	
	/*@RequestMapping("/test")
	public ModelAndView test(@RequestParam(value="greeting",required=false) String greeting )
	{
		
		if(greeting==null)
		{
			greeting="Staic Value";
		}
		ModelAndView mv=new ModelAndView("page");

		mv.addObject("greetings", greeting);
	
		return mv;

		}*/
	
	//@PathVariable use
	
	@RequestMapping("/test/{greeting}")
	public ModelAndView test(@PathVariable String greeting )
	{
		
		if(greeting==null)
		{
			greeting="Staic Value";
		}
		ModelAndView mv=new ModelAndView("page");

		mv.addObject("greetings", greeting);
	
		return mv;

		}
}
