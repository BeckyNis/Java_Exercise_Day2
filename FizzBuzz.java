package com.qa.day2.exercies;

//Create a method which returns 'Fizz' for multiples of three and 
//'Buzz' for the multiples of five.
//Return 'FizzBuzz' for numbers which are multiples of both three and five.
//Return the input number for numbers that are neither.

//num=int(input("Please enter a number: "))
//if num%3==0 and num%5==0:
//    print("fizzbuzz")
//elif num%5==0:
//    print("buzz")
//elif num%3==0:
//    print("fizz")
//else:
//print("looks like its neither")

public class FizzBuzz {
	
	public static String numbers(int num) {
		if (num%3==0 && num%5==0) {
			return "FizzBuzz";
		} else if (num%5==0) {
			return "Buzz";
		} else if (num%3==0) {
			return "Fizz";
		} else
			return ""+ num;
	}

}
