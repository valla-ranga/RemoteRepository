package javaAssignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ShuffleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> ai = new ArrayList<Character>();
		ai.add('r');
		ai.add('e');
		ai.add('d');
		ai.add('h');
		ai.add('a');
		ai.add('t');
		
		Collections.sort(ai);
		System.out.println("Sorted Collection :");
		Iterator<Character> iai = ai.iterator();
		while (iai.hasNext())
		{
			System.out.println(iai.next());
		}
		
		System.out.println("Shuffled Collection :");
		
		Collections.shuffle(ai);
		Iterator<Character> iai1 = ai.iterator();
		while (iai1.hasNext())
		{
			System.out.println(iai1.next());
		}
	}

}
