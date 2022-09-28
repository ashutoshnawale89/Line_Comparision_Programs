package com.program.lincomparision;
public class LineComparision {
	
public static int checkoutLength(int x1,int x2,int y1,int y2) {     
	int num=((x2 - x1)*(x2 - x1)) + ((y2- y1)*(y2- y1));
	double length=Math.sqrt(num);
	return (int) length;
}

public static void checkLineLength() {
	//OBJECT-1
	int length1=checkoutLength(1,20,5,2);

	// OBJECT-2
	int length2=checkoutLength(12,10,12,1);
	
	// CHECKING THE LENGTH IS EQUAL,GREATER OR LESS
	int result=Integer.compare(length1, length2);  // Compare To Method 
	
	if (result==0) {
		System.out.println("The Two Length is Equal");
	}
	else if (-1==result) {
		System.out.println("The Length First is Less Than Length Second");
	}
	else if (1==result) {
		System.out.println("The Length First is Greater Than Length Second");
	}
}
public static void main(String args[]) {
	checkLineLength();
}
}