package com.anees.squarnumbers;

public class SquareNumbers {

	public static void main(String[] args) {
		int square = 0;
		int[] arr= {2,4,5,6,7,8};
		for(int i=0; i<arr.length;i++)
			{
			square = arr[i]* arr[i];
			System.out.print(square);
			System.out.print("-");
			}

	}

}
