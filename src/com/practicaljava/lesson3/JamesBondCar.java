package com.practicaljava.lesson3;

/*
 * This class extends regular car and will add more functions to the 
 * regular car
 */
public class JamesBondCar extends Car
{
	int currentSubmergeDepth;
	boolean isGunOnBoard = true;
	//final vairables are never changing (constant)
	//Always defined in upper case
	//coding standards: https://code.google.com/p/google-styleguide/
	final String MANUFACTURER = "J.B. Limited";
	
	void submerge()
	{
		currentSubmergeDepth = 50;
	}
	
	void surface()
	{
		//Some code goes here
		
	}
	
	//These are instances of the class, the class is no longer just
	// a blueprint
	
	JamesBondCar car1 = new JamesBondCar();
	JamesBondCar car2 = new JamesBondCar();
}
