package com.syntax.class06;

import java.util.Scanner;

public class SwitchTask {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println(" Please enter your your country of origin ");
	String country= scan.nextLine();
	String language;
	
	switch (country) {
		case"America":
		case"USA":
		case"England":
			language= "English";
			break;
		
		case"Pakistan":
		case"Indian":
			language= "Urdu/Hindi";
			break;
			default:
				language = "Baqwas";
	}
	System.out.println("If you were born in "+country+ " You speak "+language);
}
}
