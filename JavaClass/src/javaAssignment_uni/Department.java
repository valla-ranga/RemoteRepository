package javaAssignment_uni;

public class Department{
	String course;
	
	public Department(String course) {
		super();
		this.course = course;
	}

	public void details()
	{
		if (course.equalsIgnoreCase("CSE"))
		{
			System.out.println(course+" Department :");
			Professor p1 = new Professor("p1","Java Programming");
			System.out.println("Students taking " +p1.subject+" are:");
		}
		if (course.equalsIgnoreCase("ECE"))
		{
			System.out.println(course+" Department :");
			Professor p2 = new Professor("p2","Electronics");
			System.out.println("Students taking " +p2.subject+" course are:");
		}
		if (course.equalsIgnoreCase("EEE"))
		{
			System.out.println(course+" Department :");
			Professor p3 = new Professor("p3","Power Systems");
			System.out.println("Students taking " +p3.subject+" course are:");
		}
		Student s1= new Student("s1"); 
		Student s2= new Student("s2");
		Student s3= new Student("s3");
	}
}