package com.apidemo.APIDemo419.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.apidemo.APIDemo419.entity.QuoteResult;

@Controller
public class HomeController {
	@RequestMapping("/")
	public ModelAndView index() {
		
		RestTemplate rt = new RestTemplate();
		QuoteResult quote = rt.getForObject("https://gturnquist-quoters.cfapps.io/api/random", QuoteResult.class);
		
		System.out.println(quote);
		
		
		return new ModelAndView("index","quotetest", quote);
	}



}
