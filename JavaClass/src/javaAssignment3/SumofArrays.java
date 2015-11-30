package javaAssignment3;

import java.util.Scanner;

public class SumofArrays {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[],i,j;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number of Elements in an Array");
		int size = s.nextInt();
		array = new int[size];
		System.out.println("Enter "+size+" elements");
		for ( i =0; i<size;i++)
		{
			array[i]=s.nextInt();
		}
	
		int sum = 0;
		for ( j =0; j< array.length;j++)
		{
			sum = sum +array[j];
		}
		System.out.println(sum); 
	}

}
