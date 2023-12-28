package com.anees.squarnumbers;

public class SquareAllNumbers {
	
	  public String squareDigits(int n[]) {
		  String tempString = "";
		  int square = 0;
			for(int i=0; i<n.length;i++)
				{
				square = n[i] * n[i];
				tempString = tempString + Integer.toString(square) + "-";
				}
			return tempString;

	  	}
	  
	  public String LowestNumber(int n[])
	  {
		  int lowest=n[0];
		  int greatest = n[1];
			
			for(int i=0; i<n.length - 1;i++)
			{
				if(lowest > n[i+1])
					lowest = n[i+1];
				else
					greatest = n[i+1];
			}
			return Integer.toString(lowest) + " " + Integer.toString(greatest);
			
	  }

}
