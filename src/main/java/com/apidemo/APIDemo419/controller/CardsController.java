package com.apidemo.APIDemo419.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CardsController {

	RestTemplate rt = new RestTemplate();

	@RequestMapping("cards")
	public ModelAndView showCards() {
//		String apiTest = rt.getForObject("https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1", String.class);
//
//		System.out.println(apiTest);
		
		String url = "https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1";
		
		// Set up your headers
		HttpHeaders headers = new HttpHeaders();
		// typically the documentation will tell you what headers are needed
		// we added this User Agent because the API returned 403 forbidden 
		headers.add(HttpHeaders.USER_AGENT, "Testing!");
		
		ResponseEntity<String> response = rt.exchange(url, HttpMethod.GET, new HttpEntity<>("parameters", headers), String.class);
		System.out.println(response);
		
		
		return new ModelAndView("index");
	}
}
