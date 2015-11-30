package javaAssignment3;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = null, i,a, size,num, s;
		System.out.println("Enter the Array size");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		array = new int[size];
		System.out.println("Enter "+size+ "elements");
		for(i=0;i<size;i++)
		{
			array[i] = sc.nextInt();
		}
		System.out.println("Enter an Element to find");
		s = sc.nextInt();
		
		for (i =0;i<size;i++)
		{
			if (array[i] == s)
			{
				System.out.println("The element is at location "+(i+1));
				break;	
			}				
		}
		if (i == size) 
		      System.out.println(s + " is not present in array.");	
	}
}

