package com.qa.day2.exercies;

public class Flowchart {

	public static void number(int a) {
		
		if (a > 2000) {
			System.out.println("A");
			
			if (a >  100) {
				System.out.println("3");
			
				if (a > 6000) {
					System.out.println("C");
					
					if (a > 600) {
						System.out.println("5");
						
						if (a > 4000) {
							System.out.println("D");
							
							if (a>500) {
								System.out.println("6");
							} else {
								System.out.println("7");
							}
						}else {
							System.out.println("E");
						}
					} else {
						System.out.println("4");
					}
				} else {
					System.out.println("B");
				}
			}else {
				System.out.println("2");
			}
		}else {
			System.out.println("1");
		}
	}			
					
}
				
