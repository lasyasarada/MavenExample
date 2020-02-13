package com.example.interestcalculation;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterest s = new SimpleInterest();
		CompoundInterest c= new CompoundInterest();
		Scanner sc=new Scanner(System.in);
		double principal = sc.nextDouble();
		double rate_of_interest = sc.nextDouble();
		int time = sc.nextInt();
		int no_of_times = sc.nextInt();
		System.out.println("Compound Interest after " + time + " years: "+c.calculateComputndInterest(principal,time,rate_of_interest,no_of_times));
		System.out.println("Simple Interst after " + time + " years: " +s.calculateSimpleInterest(principal,time,rate_of_interest));
		
	}

}
