package com.step.movierental;

class Rental {

    private Movie movie;

    private int daysRented;

    Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    int getDaysRented() {
        return daysRented;
    }

    Movie getMovie() {
        return movie;
    }

    public double getRentalFees() {
        double rentalAmount = 0;
        switch (this.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                rentalAmount = rentalAmount + 2;
                if (this.daysRented > 2) {
                    rentalAmount = rentalAmount + (this.daysRented - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                rentalAmount = rentalAmount + (this.daysRented * 3);
                break;
            case Movie.CHILDRENS:
                rentalAmount += 1.5;
                if (this.daysRented > 3) {
                    rentalAmount += (this.daysRented - 3) * 1.5;
                }
                break;
        }
        return rentalAmount;
    }

    int calculateRenterPoints() {
        int frequentRenterPoints =1;
        if ((this.getMovie().getPriceCode() == Movie.NEW_RELEASE)
                && this.getDaysRented() > 1){
            frequentRenterPoints= 2;
        }
        return frequentRenterPoints;
    }
}