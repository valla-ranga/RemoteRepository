package assignmenr;

public class InheritExampleChild extends InheritExample{

	public String courses;
	
	public InheritExampleChild(int id, String name, String dept, String courses) {
		super(id, name, dept);
		this.courses = courses;
		// TODO Auto-generated constructor stub
	}
	public void printInfo(){
		System.out.println(id+" "+name+ " "+" "+dept+" "+" "+courses);
		
	}
	

}
