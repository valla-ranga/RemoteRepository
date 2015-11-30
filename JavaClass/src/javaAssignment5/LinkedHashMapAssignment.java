package javaAssignment5;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,Integer> lhs = new LinkedHashMap<String,Integer>();
		
		lhs.put("Raja", 50);
		lhs.put("Sareesh",45);
		lhs.put("Hemanth",40);
		lhs.put("Sirish",50);
		
		Set<Entry<String,Integer>> s = lhs.entrySet();
		Iterator<Entry<String,Integer>> it = s.iterator();
		
		while(it.hasNext())
		{
			Entry<String,Integer> e = it.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}
