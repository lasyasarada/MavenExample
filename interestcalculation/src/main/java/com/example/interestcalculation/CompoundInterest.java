package com.example.interestcalculation;

public class CompoundInterest {
	public double calculateComputndInterest(double principal_amount, int time, double rate_of_interest, int no_of_times) {
        double amount = principal_amount * Math.pow(1 + (rate_of_interest / no_of_times), no_of_times * time);
        double compound_interest = amount - principal_amount;
        return compound_interest;
    }
}
