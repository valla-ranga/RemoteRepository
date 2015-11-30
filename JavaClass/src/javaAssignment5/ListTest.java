package javaAssignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> ai = new ArrayList<Integer>();
		ai.add(1);
		ai.add(2);
		ai.add(3);
		ai.add(4);
		ai.add(9);
		ai.add(6);
		ai.add(10);
		Collections.sort(ai);
	
		Iterator<Integer> iai = ai.iterator();
		while (iai.hasNext())
		{
			System.out.println(iai.next());
		}
		System.out.println("Max Element: "+Collections.max(ai));
		System.out.println("Min Element: "+Collections.min(ai));

	}

}
