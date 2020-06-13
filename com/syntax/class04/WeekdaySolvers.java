package com.syntax.class04;

import java.util.Scanner;

public class WeekdaySolvers {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
	
	
	System.out.println(" What day of the week is it?");
	int day = scan.nextInt();
	//if (day ==1 || day == 2 || day == 3 || day == 4 || day == 5) {
	if(day >=1 && day<=5) {
		System.out.println(" It is a weekday");
	}else if (day ==6 || day==7) {
		System.out.println(" It is a weekend");
	}else if( day>7) {
		System.out.println("Invalid day");
	}
		
		
		
		
		
		
		
		
	}

}
