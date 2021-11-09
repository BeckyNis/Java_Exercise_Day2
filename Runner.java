package com.qa.day2.exercies;


public class Runner {
	
	public static void main(String[] args) {
//		// Calculator
		
		//calling a static method
		System.out.println(CalculatorRevisit.addition(5, 3));
		
	
		System.out.println(CalculatorRevisit.subtract(6, 3));
		
				
		System.out.println(CalculatorRevisit.multiply(7, 5));
		

		System.out.println(CalculatorRevisit.divide(7d, 8d));
	
//		// Results		
		
		ResultsRevisited.physics = 75;
		System.out.println("Physics: " + ResultsRevisited.physics +"/150 - " + ResultsRevisited.totalMarkPhy()+ "%");
				
		ResultsRevisited.chemistry = 100;
		System.out.println("Chemistry: " + ResultsRevisited.chemistry +"/150 - " + ResultsRevisited.totalMarkChem()+ "%");
				
		ResultsRevisited.biology = 100;
		System.out.println("Biology: " + ResultsRevisited.biology +"/150 - " + ResultsRevisited.totalMarkBio()+ "%");
				
				
		System.out.println("Total Mark: " + ResultsRevisited.totalMark());
		System.out.println("Grade: " + ResultsRevisited.percentage() + "%");
		
//		//Flowchart
		
		Flowchart.number(1000);
	}
	
	
}
		
		
		
