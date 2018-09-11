package com.practicaljava.lesson3;

public class Tax 
{
	double grossIncome;
	String state;
	int dependents;
	
	//Add code for constructor
	Tax(double grossIncome,String state, int dependents)
	{
		this.grossIncome = grossIncome;
		this.state = state;
		this.dependents = dependents;
	}
	
	//Add a method to calculate tax
	public double calcTax()
	{
		double stateTax = 0;
		
		//Check the gross income
		if(grossIncome < 30000)
		{
			stateTax = grossIncome * 0.05;
		}
		else
		{
			stateTax = grossIncome * 0.06;
		}
		
		return stateTax;
	}
	
	public String calcState()
	{
		switch(state)
		{
		case "NY":
				System.out.println("Tax by NY law");
				break;
				
		case "NJ":
			System.out.println("Tax by NJ law");
			break;
			
		default:
			System.out.println("Incorrect state");
		}
		return state;
	}
}
