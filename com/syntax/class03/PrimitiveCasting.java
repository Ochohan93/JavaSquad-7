package com.syntax.class03;

public class PrimitiveCasting {
	public static void main(String[] args) {
		double d = 7;
		System.out.println(d);
		
		//narrowing (explicit casting, manually)
		int i = (int) 7.58; //compile time error : type mismatch: cannot convert from double to int
				// Casting is a type of conversion in Java
				//narrowing (explicit casting, manually)
				
				//narrowing a large number into a byte
				byte b = (byte) 123865;
		System.out.println(b);
		
		long l1 = 45;
		long l2 = 23482643223l;
		
		//you are trying to fit something
		//from a big box into a small
		int number1 = (int) l1;
		System.out.println("number1 = " +number1);
		
	}

}
