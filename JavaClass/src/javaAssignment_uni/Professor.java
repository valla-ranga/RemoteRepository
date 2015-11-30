package javaAssignment_uni;

public class Professor extends Person {
	
	String course;
	String subject;
	
	Professor(String ID,String subject)
	{
		super(ID);
		this.subject = subject;
		personDetails();
		System.out.println("Professor "+fname+" "+lname+" : " +subject);
	}
}