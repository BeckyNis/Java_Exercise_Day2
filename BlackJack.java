package com.qa.day2.exercies;

// Given 2 integer values greater than 0, return whichever is closest to 21 without going over 21. 
// If they both go over 21 then return 0.

public class BlackJack {
	
	public static int cards(int a, int b) {
		if (a <=21 && b<=21) {
			return Math.max(a, b);
		}else if (a > 21 && b>21 ) {
					return 0;
				}else {
					return Math.min(a, b);
		}
	}
}

