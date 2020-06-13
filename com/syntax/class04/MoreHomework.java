package com.syntax.class04;

import java.util.Scanner;

public class MoreHomework {
	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		
		double a=5, b =9, c =1;
		double largest = 0;
	
		if (a>b && a>c) {
			//System.out.println("Largest number is "+a);
			largest=a;
		} else if (b>a && b>c) {
			//System.out.println("Largest number is "+b);
			largest=b;
		} else if (c>a && c>b) {
			//System.out.println(" Largest number is "+c);
			largest=c;
		}
		System.out.println("Largest number is "+largest);
	}

}
