package com.apidemo.APIDemo419;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.apidemo.APIDemo419.entity.LoveMatcher;

@Controller
public class LoveController {
	
	// this annotation is used to pull values from the 
	// application.properties
	// the name should match what we gave in the application.properties
	// and live in an EL tag
	@Value("${love.key}")
	String loveKey;
	
	RestTemplate rt = new RestTemplate();
	
	@RequestMapping("love")
	public ModelAndView loveCalc(@RequestParam(value="fname", required=false) String first, @RequestParam("sname") String second) {
		
		// add any necessary headers per the documentation
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-RapidAPI-Key", loveKey);
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		
		// this is allowing us to add the header parameters to our request
		// from the API
		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
		
		String url ="https://love-calculator.p.rapidapi.com/getPercentage?fname=" + first +"&sname="+ second;
		// Make the call to the API
		ResponseEntity<LoveMatcher> response = rt.exchange(url, HttpMethod.GET, entity, LoveMatcher.class);
		// the getBody() method returns just the relevant details for the response, not all 
		// the unnecessary stuff like the status code
		System.out.println(response);
		
		return new ModelAndView("love-interest", "loveresults", response.getBody());
	}

}
