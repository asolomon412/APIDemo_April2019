package com.apidemo.APIDemo419.apiservice;

import org.springframework.web.client.RestTemplate;

import com.apidemo.APIDemo419.entity.QuoteResult;

// example showing that you should put your API methods into some type of service class
// like you would the DB methods in a DAO
public class APIService {

	RestTemplate rt = new RestTemplate();

	public QuoteResult retrieveQuote() {

		QuoteResult quote = rt.getForObject("https://gturnquist-quoters.cfapps.io/api/random", QuoteResult.class);
		return quote;
	}
}
