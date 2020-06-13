package com.syntax.class04;

public class MoreLogicalOperators {
	public static void main(String[] args) {
		// We have 7 days of the week
		// if day 2, 4 --> SDLC Class
		// if day is 6, 7 --> Java class
		// if day is 1, 5 --> No class
		// if day is 3 --> Review class
		

		
		
		// To compare the equality of two Strings we use .equals()
		
		String day2 = "Tuesday";
		if (day2.equals("Tuesday") || day2.equals("Thursday")) {
			System.out.println("SDLC class");
		} else if (day2.equals("Saturday) || day2.equals("Sunday")) {
			System.out.println("Java class");
		} else {
			System.out.println(" Not implemented");
		}
	}

}
