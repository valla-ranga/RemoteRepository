package javaAssignment3;

import java.util.Arrays;

public class IncreasingArraySize {
	
	public static void main(String[]args)
	{
		int array[] = {2,35,3,26,15,29};
		System.out.println("Size of Array before changing" + array.length);
		int modifiedarray[] = Arrays.copyOf(array, 30);
		System.out.println("Size of Array after modification" + modifiedarray.length);
	}

}
