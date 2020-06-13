package dayThree;

public class NotCamelCasing {
	public static void main(String[] args) {
		float a = 3.9f;
		float b = 3.9f * 3.9f;
		String str = "The Square of " + a + " is " + b;
		System.out.println(str);
//Separate Functions
		int W = 5;
		int H = 8;
		int P = 2*(W+H);
		int A = W*H;
		String str2 = "The perimeter of a rectangle with a width of "+W+" and a height of "+H+" is equal to "+P+" and the area is "+A; 
	System.out.println(str2);
	
	
	
	}
}
