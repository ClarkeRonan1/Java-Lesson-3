package com.practicaljava.lesson3;

public class SmallerTax extends Tax
{
	//This class inherits from Tax
	//But I want to override the constructor in Tax
	SmallerTax(double gi, String st, int depen)
	{
		super(gi,st,depen);
		
		System.out.println("Applying special tax rates"
				+ " for my friends");
	}
}
