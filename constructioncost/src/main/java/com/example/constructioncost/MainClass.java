package com.example.constructioncost;

import java.util.Scanner;

public class MainClass {
	public static void main(String a[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Select your material standard:");
		System.out.println("1.Standard\n2.Above Standard\n3.High Standard\n");
		int select_materialstandard = s.nextInt();
		System.out.println("Enter the area of the house in square feet:");
		double area = s.nextDouble();
		int select_automation_required = 1;
		if (select_materialstandard == 3) {
			System.out.println("Select your option:");
			System.out.println("1.Normal\n2.Fully Automated");
			select_automation_required = s.nextInt();
		}
		HouseConstruction myhouse = new HouseConstruction();
		myhouse.materialCost(select_materialstandard,select_automation_required,area);
	}
}
