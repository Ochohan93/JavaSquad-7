package com.syntax.class04;

public class NestedIfContinous {
	public static void main(String[] args) {
		//check if patient has allergies
		// if not allergies --> youre healthy
		//otherwise:
		//if peanut allergy dont eat peanuts
		//Lactose Intolerance: Don't drink milk
		//Bee Allergy: Don't mess with bees
		//seagood allergy : Dont eat fish
		
		boolean allergies= true;
		boolean peanut= true;
		boolean lactose= false;
		boolean bee= true;
				
				if (!allergies) {
					//no allergy
					System.out.println(" Youre Healthy");
				}else {
					//We have to check which allergy
					if (peanut) {
						System.out.println("Dont eat peanut");
					} if (lactose) {
						System.out.println("Dont drink milk");
					} if (bee) {
						System.out.println("Dont mess with bees");
					}
				}
	
	
	
	
	
	
	
	
	}

}
