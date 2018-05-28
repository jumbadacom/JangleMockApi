package com.example.apidemo.mocky;


public enum Language {
	EN_US("en", "US"), TR_TR("tr", "TR");

	private String country;

	private String language;

	private Language(String language, String country) {
		this.country = country;
		this.language = language;
	}

	public String getCountry() {
		return country;
	}

	public String getLanguage() {
		return language;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}