package com.qa.day2.exercies;

//Expand the Results class so that there is now a pass mark of 60%; 
//if the person receives under 60% they get a fail message.
//
//Expand the previous example so that even if the person gets higher than 60% overall, 
//if they fail 1 or more of the exams (pass grade of 60% for each exam) 
//they still fail overall.
//
//eg. if a student's scores were: Biology: 150, 
//Chemistry: 150, Physics: 84
//
//they would have an overall grade of 85.3% (Pass)
//
//but in this case the student would fail because their physics 
//grade is 54% (Fail)
//
//Expand the above so that the message that is displayed varies 
//depending on the number of subjects that they have failed.

public class ResultsRevisited {
	
		
		static int physics;
		static int chemistry;
		static int biology;
		
		public static String totalMarkPhy() {
			int totalPhy =(physics*100)/150;
			if (totalPhy>=60) {
				return "PASS \nPercentage:" + totalPhy;	
			} else {
				return "FAIL \nPercentage:"+ totalPhy ;
			}
		}
		
		public static String totalMarkChem() {
			int totalChem =(chemistry*100)/150;
			if (totalChem>=60) {
				return "PASS \nPercentage:" + totalChem;	
			} else {
				return "FAIL \nPercentage:"+ totalChem ;
			}
		}
		
		public static String totalMarkBio() {
			int totalBio =(biology*100)/150;
			if (totalBio>=60) {
				return "PASS \nPercentage:" + totalBio;	
			} else {
				return "FAIL \nPercentage:"+ totalBio ;
			}
		}
		
		
		
		public static int totalMark() {
			int total = physics + chemistry + biology;
			return total;
		}
		
		public static String percentage() {
			double percent = (totalMark()*100)/450;
			int totalBio =(biology*100)/150;
			int totalChem =(chemistry*100)/150;
			int totalPhy =(physics*100)/150;
					
			if (totalBio>=60 && totalChem>=60 && totalPhy>=60 ) {
				return "PASS \nOverall Percentage:" + percent;	
			} else {
				return "FAIL (minumin of 60% in all modules) \nOverall Percentage: " + percent ;
			}
				
		}
		
		

}
