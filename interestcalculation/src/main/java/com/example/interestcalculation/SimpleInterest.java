package com.example.interestcalculation;

public class SimpleInterest {
	public double calculateSimpleInterest(double principal, int time, double rate) 
	{
        double simple_interest = principal * time * rate / 100.0; 
        return simple_interest;
    }
}
