package com.practicaljava.lesson3;

public class NewJerseyTax extends Tax
{
	//Since NewJersey has reduced taxes
	//for students Tax needs to be 
	//adjusted
	
	NewJerseyTax(double grossIncome, String state, int dependents) {
		super(grossIncome, state, dependents);
		// TODO Auto-generated constructor stub
	}

	//Add new method to make adjustment
	double adjustForStudents(double stateTax)
	{
		double adjustedTax = stateTax - 500;
		return adjustedTax;
	}
}
