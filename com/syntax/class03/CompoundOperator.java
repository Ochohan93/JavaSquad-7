package com.syntax.class03;

public class CompoundOperator {
	public static void main(String[] args) {
		int num = 100;
		num = num+100; //200
		System.out.println(num);
		//300
		
		num = num+100;
		
		//we can use compound operators which are shortcuts
		num += 100;
		System.out.println(num);
		//400
		
		//num = num-50;
		//long way
		
		num -=50;
		//shortcut
		System.out.println(num);
		
		
	
}
}
