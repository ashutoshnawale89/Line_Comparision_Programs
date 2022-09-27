package com.program.lincomparision;

public class LineComparision {
	public static double CheckoutLength(int x1,int x2,int y1,int y2) {     
		int num=((x2 - x1)*(x2 - x1)) + ((y2- y1)*(y2- y1));
		double length=Math.sqrt(num);
		return length;
		}
	public static void checkEquality() {
	// CALCULATE LENGTH
	double length1= CheckoutLength(1,20,5,2);
	double length= CheckoutLength(12,10,12,1);

	// CHECK THE EQUAL OR UNEQUAL LENGTH
	if (length==length1) {
		System.out.println("The Length of The Two Lines is Equal");
	}
	else {
		System.out.println("The Length of The Two Lines is UnEqual");
	}
	System.out.println("The Length of The Line is  " + length1 );
	System.out.println("The Length of The Line is  " + length );
	}
	
	public static void main(String args []) {
		checkEquality();
	}
}



