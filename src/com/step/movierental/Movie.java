package com.step.movierental;

class Movie {
	static final int  CHILDRENS = 2;
	static final int  REGULAR = 0;
	static final int  NEW_RELEASE = 1;

	private String title;
	private int priceCode;

	Movie(String title, int priceCode) {
		this.title = title;
		this.priceCode = priceCode;
	}

	int getPriceCode() {
		return priceCode;
	}

	void setPriceCode(int arg) {
    	priceCode = arg;
	}

	String getTitle() {
		return title;
	}
}

