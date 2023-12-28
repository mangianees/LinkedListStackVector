package com.anees.squarnumbers;

public class SquareAllNumbers {
	
	  public String squareDigits(int n[]) {
		  String tempString = "";
		  int square = 0;
			for(int i=0; i<n.length;i++)
				{
				System.out.println(n[i]);
				square = n[i] * n[i];
				tempString = tempString + Integer.toString(square) + "-";
				}
			return tempString;

}

}
