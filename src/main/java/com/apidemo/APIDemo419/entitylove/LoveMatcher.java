package com.apidemo.APIDemo419.entitylove;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LoveMatcher {

	private String fname;
	private String sname;
	private String result;
	private String percentage;

	public LoveMatcher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "LoveMatcher [fname=" + fname + ", sname=" + sname + ", result=" + result + ", percentage=" + percentage
				+ "]";
	}

}
