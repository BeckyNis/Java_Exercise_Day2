package com.qa.day2.exercies;

//Edit the division method in the Calculator class, 
//the sum should only execute if the first parameter is smaller than the second, 
//otherwise it printsout a message saying that the division cannot be performed.

public class CalculatorRevisit {
	
	public static int addition(int a, int b) {
		return a+b;
	}

	public static int subtract(int a, int b) {
		
		return a-b;
	}

	public static int multiply(int a, int b) {
		
		return a*b;
	}
	
	public static String divide( double a, double b) {
		
		if (a < b) {
			double result = b/a;
			return "" + result ;
		} else {
			return "Division cannot be performed";
		}
	}

}

	
