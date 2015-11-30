package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudentTest {

	public static void main (String [] args)
	{
		/*Student s1 = new Student("Ranganath","v", "Java");
		Student s2 = new Student("Jaya","v", "Java");
		Student s3 = new Student("Anuradha","c", "Java");
		Student s4 = new Student("Uma","R", "Java");
		Student s5 = new Student("Sushant","p", "Java");
		Student s6 = new Student("Vijaya","t", "Java");
		Student s7 = new Student("Ranganath","v", "Java");
		
		HashSet<Student> stu = new HashSet<Student>();
		stu.add(s1);
		stu.add(s2);
		stu.add(s3);
		stu.add(s4);
		stu.add(s5);
		stu.add(s6);
		stu.add(s7);
		
		System.out.println("Number of Students: " +stu.size());*/
		
		Iterator<Student> it = stu.iterator();
		 Student s;
		 while (it.hasNext())
		 {
			 s = (Student)it.next();
			 System.out.println(s.getFname()+" ,"+s.getLname());
			 it.remove();
		 }
		System.out.println("Number of Students: "+stu.size());
	}
}
