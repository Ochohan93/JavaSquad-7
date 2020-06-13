package com.syntax.class04;

import java.util.Scanner;

public class MoreScanner {
	public static void main(String[] args) {
		//create a java program that will ask if user has a credit card or not.
		//If the user does not have one, then offer them.
		//If they do not ask what is balance on the card.
		//If balance is larger than 1000 , tell them to pay off immediately
		// otherwise tell them to spend more
		
		Scanner scan = new Scanner(System.in);
		boolean cc;
		
		System.out.println("Do you have a credit card");
		cc = scan.nextBoolean();
		
		if(cc) {
			System.out.println(" What is your credit card balance?");
			double balance = scan.nextDouble();
			if (balance>=1000) {
				System.out.println(" Pay off immediately please!");
			}else {
				System.out.println(" You can spend more!");
			}
			
		} else {
			System.out.println(" Do you want to apply for our best credit card?");
		}
	}

}
