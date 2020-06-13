package com.syntax.class04;

public class ElseIfCondition {
	public static void main(String[] args) {
		//check if number is positive or negative
		int num = 75;
		if (num > 0) {
			System.out.println("Number is positive!");
		} else {
			System.out.println("Number is negative!");
		}
		
		//2nd way
		if (num > 0) {
			System.out.println("Number is Positive!");
		} else if (num==0) {
			System.out.println("Number is 0!");
		} else {
			System.out.println("Number is Negative!");
		}
		
		// check if odd or even
		int num3= 67;
		int remainder = num3%2;
		
		if (remainder ==0) {
			System.out.println(num3 + " is even");
		} else {
			System.out.println(num3 + " is odd ");
		}
		
	}

}
