package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count[] = {32,65,98,6,23,54};
		Set<Integer> set = new HashSet<Integer>();
		try
		{
			for(int i =0; i<6;i++)
			{
				set.add(count[i]);
			}
			System.out.println(set);
			
			TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
			System.out.println("The sorted list is");
			System.out.println(sortedSet);
			System.out.println("1st element is " +sortedSet.first());
		}
		catch(Exception e){
			
		}
	}
}