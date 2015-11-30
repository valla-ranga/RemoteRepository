package javaAssignment4;

import java.util.Arrays;

public class BinarySearchTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char chararray[] = {'v','s','d','g','r','y'};
		for (char number1 :chararray )
		{
			System.out.println("Number = "+number1);
		}
		System.out.println("Characters in inserted order :");
		Arrays.sort(chararray);
		System.out.println("The sorted array is :");
		for (char number :chararray)
		{
			System.out.println("Number = "+number);
		}
		
		char search = 's';
		int res = Arrays.binarySearch(chararray, search);
		
		System.out.println("The character is at "+res);
		
		

	}

}
