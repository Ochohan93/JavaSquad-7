package com.syntax.class04;

import java.util.Scanner;

public class EvenMoreScanner {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		//write a program to ask user to enter numbers of worked years and annual salary.
		// If user worked for more or equals to 5 years then user is eligible for bonus,
		// otherwise he is not
		//once user is eligible and the salary is larger than 50000
		// then bonus = 5000 otherwise 3000
		
		System.out.println(" Please enter your duration of work!");
		int years = scan.nextInt();
		
		System.out.println(" Please enter your annual salary");
	    double salary = scan.nextDouble();
	    
	    if (years>=5) {
	    	System.out.println(" You are eligible for the bonus! ");
	    	
	    	if (salary > 50000) {
	    		System.out.println(" Your bonus is 5000");
	    	} else {
	    		System.out.println(" Your bonus is 3000");
	    	}
	    	
	    } else {
	    	System.out.println(" You are NOT eligible for the bonus SUCKAA!");
	    }
		
		
		
	}

}
