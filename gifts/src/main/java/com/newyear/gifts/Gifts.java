package com.newyear.gifts;

import java.util.Scanner;

public class Gifts {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Number of Chocolates:");
		int noofchocy=s.nextInt();
		System.out.print("Number of Sweets:");
		int noofsweets=s.nextInt();
		int[] chocy=new int[noofchocy];
		int[] sweets=new int[noofsweets];
		for(int i=0;i<noofchocy;i++)
		{
			System.out.print("Enter the weight of "+(i+1)+" chocolate:");
			chocy[i]=s.nextInt();
		}
		Chocolate c1=new Chocolate();
		int cweight=c1.totalWeight(chocy, noofchocy);
		for(int i=0;i<noofsweets;i++)
		{
			System.out.print("Enter the weight of "+(i+1)+" sweet:");
			sweets[i]=s.nextInt();
		}
		Sweets s1=new Sweets();
		int sweight=c1.totalWeight(sweets, noofsweets);
		System.out.print("Enter the minimum weight of candies:");
		int min=s.nextInt();
		System.out.print("Enter the maximum weight of the candies:");
		int max=s.nextInt();
		int totalchocycandy=c1.totalCandies(min,max,chocy,noofchocy);
		int totalsweetcandy=s1.totalCandies(min,max,sweets,noofsweets);
		int totalnoofcandy=totalchocycandy+totalsweetcandy;
		if(totalnoofcandy>=1)
			System.out.print("Awe!! You recieved "+totalnoofcandy+" candies");
		else
			System.out.print("You recieved only "+totalnoofcandy+" candies");
		
		
	}

}
