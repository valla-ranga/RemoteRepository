package javaAssignment4;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(98547856);
		hs.add(87594568);
		hs.add(85428978);
		hs.add(147586958);
		
		 Iterator<Integer> itr = hs.iterator();
		   int num = itr.next();

		    while(itr.hasNext()){
		        int tmp = itr.next(); 
		        if(num < tmp){
		            num = tmp;
		        }
		    }
		    System.out.println(" Max Number "+ num);
	}
}