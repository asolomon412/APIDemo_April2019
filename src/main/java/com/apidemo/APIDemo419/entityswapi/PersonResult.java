package com.apidemo.APIDemo419.entityswapi;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonResult {

	private int count;
	private String next;
	// results is an array in the json data that is returned but we can use any type
	// of collection
	private ArrayList<Person> results;

	public PersonResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public ArrayList<Person> getResults() {
		return results;
	}

	public void setResults(ArrayList<Person> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "PersonResult [count=" + count + ", next=" + next + ", results=" + results + "]";
	}

}
