package com.qa.day2.exercies;


public class Taxes {
	
	public static String tax(int salary) {
		if (salary <= 14999) {
			return "Tax percentage: 0% \nAmount taken: £" + salary*0;
		}else if (14999 < salary && salary<= 19999) {
			return "Tax percentage: 10% \nAmount taken: £" + salary*0.1;
		}else if (19999 < salary && salary<= 29999) {
			return "Tax percentage: 15% \nAmount taken: £" + salary*0.15;
		}else if (29999 < salary && salary<= 44999) {
			return "Tax percentage: 20% \nAmount taken: £" + salary*0.2;
		}else if (45000 <= salary) {
			return "Tax percentage: 25% \nAmount taken: £" + salary*0.25;
		}else {
			return "Error";
		}
	}

}
