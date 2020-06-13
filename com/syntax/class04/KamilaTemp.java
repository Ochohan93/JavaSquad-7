package com.syntax.class04;

import java.util.Scanner;

public class KamilaTemp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Please enter your city");
		String city= scan.next();
		
		System.out.println(" Please enter the temperature in Fahrenheit!");
		int tempF = scan.nextInt();
		
		int tempC = (tempF -32)*5 / 9;
		System.out.println(" The temperature (Celsius) of the city " +city+ " is " + tempC);
		
		int tempc2 = (int) ((tempF - 32))
		
	}

}
