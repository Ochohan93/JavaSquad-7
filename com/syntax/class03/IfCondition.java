package com.syntax.class03;

public class IfCondition {
	public static void main(String[] args) {
		//Declare a numb and compare if the number is larger than 100
		//If it is larger than 100, I will print "My number is large
		
		int num = 78;
		
		boolean result = num > 100;
		System.out.println("Let us check");
		
		if (num > 100) {
			System.out.println("My number is large");
		} else { 
			System.out.println("My number is small ");
		}
		
		System.out.println("The check is complete");
	}

}
