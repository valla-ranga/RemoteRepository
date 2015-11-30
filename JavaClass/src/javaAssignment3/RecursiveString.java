package javaAssignment3;

import java.util.*;

public class RecursiveString {

			static void reverse(String str, int length)
			{		 
		         System.out.print(str.charAt(length));
		         if(length!=0)
		           reverse(str,length-1);
			}
			public static void main (String[] args) throws java.lang.Exception
			{
				Scanner s = new Scanner(System.in);
				System.out.println("Enter a String");
				String str = s.nextLine();
				reverse(str, str.length()-1);
			}
}