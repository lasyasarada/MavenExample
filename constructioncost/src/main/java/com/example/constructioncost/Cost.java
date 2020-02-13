package com.example.constructioncost;

public class Cost extends Abstract{
	public void getCost(int cost,double area) {
		double house_cost = cost*area;
		System.out.println("The House construction cost is Rs."+house_cost + "/-" );
		
	}

}
