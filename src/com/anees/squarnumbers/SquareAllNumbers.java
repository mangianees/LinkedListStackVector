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
			return "Squares of array " + tempString;

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
			return "Lowest= " + Integer.toString(lowest) + " " + "Greatest= " + Integer.toString(greatest);
			
	  }
	  
	  public String BubbleSort(int[] n) {
		  
			boolean swap;
			int temp=0;
			String NewStr="";
			
			for(int i=0;i<n.length - 1;i++)
			{
				swap=false;
				for(int j=0;j<n.length -1;j++)
				{
						if(n[j]>n[j+1])
						{
							temp = n[j+1];
							n[j+1]=n[j];
							n[j]=temp;
							swap= true;
							
						}
				}
				
			if(swap==false)
				break;
			}
			
			for(int i=0;i<n.length;i++)
				NewStr= NewStr + Integer.toString(n[i]);
			return "Bubble Sorted Arrays " + NewStr;
				

	  }

}
