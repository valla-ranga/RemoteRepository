import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c1 = new Course(1, "circuit", "EE");
		Course c2 = new Course(2,"power", "ECE");
		Course c3 = new Course(2, "electronics", "ECE");
		
		TreeSet<Course> ts = new TreeSet<Course>();
		ts.add(c1);
		ts.add(c2);
		System.out.println(ts.size());
		
		

	}

}
