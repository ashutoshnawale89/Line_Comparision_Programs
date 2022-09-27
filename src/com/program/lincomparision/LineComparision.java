package com.program.lincomparision;
public class LineComparision {
	
public static double checkoutLength(int x1,int x2,int y1,int y2) {     
	int num=((x2 - x1)*(x2 - x1)) + ((y2- y1)*(y2- y1));
	double length=Math.sqrt(num);
	return length;
}

public static void checkLineLength() {
	//OBJECT-1
	double length1=checkoutLength(1,20,5,2);

	// OBJECT-2
	double length2=checkoutLength(12,10,12,1);

	// CHECKING THE LENGTH IS EQUAL,GREATER OR LESS
	if (length2==length1) {
		System.out.println("The Two Length is Equal");
	}
	else if (length2>length1) {
		System.out.println("The Length First is Less Than Length Second");
	}
	else if (length2<length1) {
		System.out.println("The Length First is Greater Than Length Second");
	}
}
public static void main(String args[]) {
	checkLineLength();
}

}