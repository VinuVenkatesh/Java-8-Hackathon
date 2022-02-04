package com.cgi.cgihackatonweek2partb;

public class Country {

	private int countryID;
	private String countryName;
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Country(int countryID, String countryName) {
		super();
		this.countryID = countryID;
		this.countryName = countryName;
	}
	public int getCountryID() {
		return countryID;
	}
	public void setCountryID(int countryID) {
		this.countryID = countryID;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	@Override
	public String toString() {
		return "Country [countryID=" + countryID + ", countryName=" + countryName + "]";
	}
	
}
