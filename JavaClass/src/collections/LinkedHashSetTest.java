package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetTest {
/* It maintains the Insertion order
 * it will allow null
 * it wont allow duplicates
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("Circuits");
		lhs.add("Chemistry");
		lhs.add("Power Systems");
		lhs.add("Electronics");
		
		Iterator<String> it = lhs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("Tree Set Sorting");
		TreeSet<String> ts = new TreeSet<>(lhs);
		
		Iterator<String> itts = ts.iterator();
		
		while(itts.hasNext())
		{
			System.out.println(itts.next());
		}
	}

}
