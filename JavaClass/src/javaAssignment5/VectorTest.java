package javaAssignment5;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>();
		v.add("Circuits");
		v.add("Power Systems");
		v.add("Mathematics");
		v.add("Physics");
		v.add("Chemistry");
		
		System.out.println("Vector size : "+v.size());
		System.out.println("IndexOf Physics : "+v.indexOf("Physics"));
		System.out.println(v.isEmpty());
		
				
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
			
		}
		Vector<String> v1 = new Vector<String>();
		v1.add("Electronics");
		v1.add("Arts");
		v1.add("Mechanics");
		
		v.addAll(v1);
		System.out.println("Vector size after merger : "+v.size());
		
		Enumeration<String> e1 = v.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
			
		}
		System.out.println("Last index is: "+ v.lastIndexOf("Arts"));
		v.remove("Arts");
		System.out.println("Last index is: "+ v.lastIndexOf("Arts"));
	}

}
