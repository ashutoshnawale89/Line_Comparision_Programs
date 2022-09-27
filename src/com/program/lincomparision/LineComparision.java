package com.program.lincomparision;

public class LineComparision {
	public static double CheckoutLength(int x1,int x2,int y1,int y2) {     
		int num=((x2 - x1)*(x2 - x1)) + ((y2- y1)*(y2- y1));
		double length=Math.sqrt(num);
		return length;
		}
		public static void main(String[] args)
		{
			double length=LineComparision.CheckoutLength(12,14,15,1);
			System.out.println("The Length of The Line is  "+length );
	
	
		}
	}


