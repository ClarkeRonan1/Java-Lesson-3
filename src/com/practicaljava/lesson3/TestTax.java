package com.practicaljava.lesson3;

public class TestTax 
{
	public static void main(String[] args)
	{
		NewJerseyTax t = new NewJerseyTax(20000,"",3); //create an instance
		
		Tax t2 = new Tax(30000, "NY", 2); //Using the class constructor
		
		SmallerTax t3 = new SmallerTax(12000,"NJ",2); //Using the super method
		//to override the constructor of Tax
		
		
		//assign values to class members
		t.grossIncome = 50000;
		t.dependents = 2;
		t.state = "";
		
		
		double yourTax = t.calcTax(); //calculating tax
		double totalTax = t.adjustForStudents(yourTax);
		String tState = t.calcState();
		String t2State = t2.calcState();
		String t3State = t3.calcState();
		
		//Print the result
		System.out.println("Normal tax is " + yourTax);
		System.out.println("Your adjusted tax is " + totalTax);
	}
}
