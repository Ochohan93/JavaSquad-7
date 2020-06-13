package com.classV;

public class ConditionalCombatStatements {
	
	public static void main(String[] args) {
	int num1=20;
	int num2=30;
	if(num1>num2) {
		System.out.println("num1 is greater than num2");
		//this will execute only if true
	} else {
		System.out.println("num1 is less than num2");
		//this will execute if false
	}
	
	if(true) {
		System.out.println("if statement");
		
	}else if(true){
		System.out.println("1 if else statement");
		
	}else if(true){
		System.out.println("2 if else statement");
		
	}else if(!false) {
		System.out.println("3 if else statement");
		
	}else {
		System.out.println("else statement");
	}

	int month=3;
	if(month==1){
		System.out.println("January");
    }else if(month==2){
    	System.out.println("February");
    }else if(month==3){
    	System.out.println("March comes in like a lion");
    }else if(month==4){
    	System.out.println("April");
    }else if(month==5){
    	System.out.println("May");
    }else if(month==6){
    	System.out.println("June");
    }else if(month==7){
    	System.out.println("July");
    }else if(month==8){
    	System.out.println("August");
    }else if(month==9){
    	System.out.println("September");
    }else if(month==10){
    	System.out.println("October");
    }else if(month==11){
    	System.out.println("November");
    }else if(month==12){
    	System.out.println("December");
    }
	//Check if number is positive or negative
	int pos=-3;
	if(pos>=0){
		System.out.println("number is positive");
	}else{
		System.out.println("number is negative");
		
	}
	//Write a Java Program to check whether number is even or odd
	int desiredNum=5;
	if(desiredNum%2==0) {
		System.out.println("Number is Even");
	}else {
		System.out.println("Number is Odd");
		
	}
	
	
}
}