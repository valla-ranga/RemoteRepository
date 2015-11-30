package javaAssignment2;

public class Seminar {
	
	public String title;
	public String date;
	public String time;
	public String venue;
	public String department;
	public String person;
	
	Person p = new Person("john","presentor");
	Department d = new Department("surgery");
	public Seminar() {
		
		 this.department = d.dept_name;
		 this.person = p.name;
			}
	public void print()
	{
		System.out.println(""+this.department+this.person);
	}
}
