package com.step.movierental;

import java.util.*;

class Customer {

	private String name;
	private List<Rental> rentalList = new ArrayList<Rental>();

	Customer(String name) {
		this.name = name;
	}

	void addRental(Rental arg) {
		rentalList.add(arg);
	}

	private String getName() {
		return name;
	}

	String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		String result = "Rental Record for " + getName() + "\n";

		for (Rental rental : rentalList) {
			totalAmount += rental.getRentalFees();
			frequentRenterPoints++;

			result += "\t" + rental.getMovie().getTitle() + "\t"
					+ rental.getRentalFees() + "\n";
			if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE)
					&& rental.getDaysRented() > 1)
				frequentRenterPoints++;
		}

		// add footer lines
		result += "Amount owed is " + totalAmount + "\n";
		result += "You earned " + frequentRenterPoints
				+ " frequent renter points";
		return result;
	}


}
