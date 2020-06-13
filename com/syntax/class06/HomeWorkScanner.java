package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkScanner {
	public static void main(String[] args) {
		// Write a program for user to enter birth month
		// Based on the month define the season
		// Example: If user is born in June, July, or August season = Summer
		// at the end of the program we should see output as " You were born ______"
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" Please enter your birth month");
		
		String month= scan.next();
		String season = "unknown";
		
		if (month.equals("December") || month.equals("January") || month.equals("February" )) {
			season="Winter";
		} else if (month.contentEquals("March")||month.contentEquals("April")||month.equals("May")) {
			season="Spring";
		}else if (month.contentEquals("June")||month.contentEquals("July")||month.equals("August")) {
			season="Summer";
		}else if (month.contentEquals("September")||month.contentEquals("October")||month.equals("November")) {
			season="Fall";
		}else {
			season = "unknown";
		}
		
       System.out.println("You were born in "+season);
	}

}
