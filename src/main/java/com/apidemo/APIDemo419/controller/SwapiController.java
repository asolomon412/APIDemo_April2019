package com.apidemo.APIDemo419.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.apidemo.APIDemo419.entityswapi.PersonResult;

@Controller
public class SwapiController {
	RestTemplate rt = new RestTemplate();

	@RequestMapping("characters")
	public ModelAndView showCharacters() {

		String url = "https://swapi.co/api/people/?format=json";

		// Set up your headers
		HttpHeaders headers = new HttpHeaders();
		// typically the documentation will tell you what headers are needed
		// we added this User Agent because the API returned 403 forbidden
		headers.add(HttpHeaders.USER_AGENT, "Testing!");

		ResponseEntity<PersonResult> response = rt.exchange(url, HttpMethod.GET, new HttpEntity<>("parameters", headers),
				PersonResult.class);
		System.out.println(response.getBody());

		return new ModelAndView("character-list", "list", response.getBody().getResults());
	}
}
