package javaAssignment4;

import java.util.Scanner;

public class BinarySearch {
	
	public static void main (String []args)
	{
		int first,i,n;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		 n = sc.nextInt();
		 
		System.out.println("Enter "+n+" elements");
		
		String Array[] = new String[n];
		
		for ( i = 0; i<=n; i++)
		{
			Array[i] = sc.nextLine();
		}
		
		
		
	}

}
