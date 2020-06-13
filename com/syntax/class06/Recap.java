package com.syntax.class06;

public class Recap {
	public static void main(String[] args) {
		//if hour is between 1am and 11 am --> morning
		//if hour is between 12pm and 15 --> afternoon
		//if hour is between 16 and 20 --> evening
		//if hour is between 21 and 24 -->
		//We will print : Right now it is ______________
		
		int hour = 35;
		String dayTime;
		
		if(hour>=1 && hour<=11) {
			dayTime = "morning";
		}else if(hour>=12 && hour <=15) {
			dayTime = "afternoon";
		}else if (hour >=16 && hour <=20) {
			dayTime = "evening";
		}else if(hour>=21 && hour <=24) {
			dayTime = "night";
		}else {
			dayTime = "unknown";
		}
		
		// dayTime = unknown then i dont want to print anything
		if (!dayTime.equals("unknown")) {
		System.out.println(" Right now it is " +dayTime);
		}
	}

}
