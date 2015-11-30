package javaAssignment4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListReverse {

	private void reverse()
	{
		HashSet courses;
		LinkedList<String> ll = new LinkedList<String>(courses);
		Collections.reverse(ll);
		System.out.println("Results after reverse operation:");
		for(String str: ll){
		    System.out.println(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> courses = new HashSet<String>();
		courses.add("Circuits");
		courses.add("Power Systems");
		courses.add("Electronics");
		courses.add("Machines");
		courses.add("Physics");
		courses.add("Calculus");
		courses.add("Machines");
		
		Iterator<String> ihs = courses.iterator();
		while(ihs.hasNext())
		{
			System.out.println(ihs.next());
		}
		
		System.out.println("***********************");
		LinkedList<String> ll = new LinkedList<String>(courses);
		LinkedList<String> ll1 = new LinkedList<String>(courses);
		
                String first = ll.getFirst();
		        String last = ll.getLast();		      
		        System.out.println(" "+ last);
		        ll.remove(last);
		        ll1.add(last);
	}        
			

}

