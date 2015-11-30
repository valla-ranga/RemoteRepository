package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		Courses c1 = new Courses(206,"Circuit Analysis","EE");
		Courses c2 = new Courses(306,"Circuit Laboratory","EE");
		Courses c3 = new Courses(251,"Physics I","Sciences");
		Courses c4 = new Courses(121,"Chemistry I","Sciences");
		Courses c5 = new Courses(165,"Calculus I","MATH");
		Courses c6 = new Courses(150,"Fine Arts","ARTS");
		
		TreeSet<Courses> cts = new TreeSet<Courses>(new CourseTitleAscending());
		
		cts.add(c1);
		cts.add(c2);
		
		System.out.println("Number of Courses :"+ cts.size());
		Iterator<Courses> it = cts.iterator();
		Courses c;
		while (it.hasNext())
		{
			c = (Courses)it.next();
			System.out.println(c.getDept()+" "+c.getId());
		}
	}
}