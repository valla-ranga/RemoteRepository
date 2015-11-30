package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> students = new HashSet<String>();
		students.add("Anuradha");
		students.add("Jaya");
		students.add("Uma");
		students.add("Ranganath");
		students.add("Sushant");
		students.add("Vijaya");
		boolean isTrue = students.contains("Ranganath");
		System.out.println(isTrue);
		Iterator<String> it = students.iterator();
		System.out.println("Size is : "+students.size());
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("********");
		
		
		Map <String,String> Mstudents = new HashMap<String, String>();
		Mstudents.put("Anuradha", "C");
		Mstudents.put("Jaya", "v");
		Mstudents.put("Uma", "R");
		Mstudents.put("Ranganath", "V");
		Mstudents.put("Sushant", "P");
		Mstudents.put("Vijaya","T");
		System.out.println(Mstudents);
	}

}
