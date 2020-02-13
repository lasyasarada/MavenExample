package com.example.constructioncost;

public class HouseConstruction{
	Cost c = new Cost();
	int cost;
	public void materialCost(int select_materialstandard, int automation_required,double area) {
		switch(select_materialstandard) {
		case 1:
			cost = 1200;
			c.getCost(cost,area);break;
		case 2:
			cost = 1500;
			c.getCost(cost,area);break;
		case 3:
			if (automation_required == 1) {
				cost = 1800;
				c.getCost(cost,area);break;
			}
			else if(automation_required == 2){
				cost = 2500;
				c.getCost(cost,area);break;
			}
			else {
				System.out.println("Select the correct option!!");
				exit(0);
			}
		default:System.out.println("Select the correct material standard!!");exit(0);
			
		}
		
	}
	private void exit(int i) {
		// TODO Auto-generated method stub
		
	}
	
}
