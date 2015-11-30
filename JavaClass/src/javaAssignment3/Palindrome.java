package javaAssignment3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String original = sc.nextLine();
		int i;
		String reverse = "";
		for(i = original.length()-1; i>=0;i--)
		{
			reverse = reverse + original.charAt(i);
		}
		if ( original.equals(reverse))
		{
			System.out.println(original+ " is palisdrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
