package javaAssignment_uni;

public class Person {
	public String ID;
	public String fname;
	public String lname;
	
	public Person(String ID)
	{
		this.ID = ID;
		
	}
	public void personDetails()
	{
		if (ID.equals("s1"))
		{
			fname = "Ari";
			lname = "Weiss";
		}
		if (ID.equals("s2"))
		{
			fname = "Robin";
			lname = "Sky";
		}
		if (ID.equals("s3"))
		{
			fname = "Erubes";
			lname = "Ben";
		}
		if (ID.equals("p1"))
		{
			fname = "Neil";
			lname = "Burness";
		}
		if (ID.equals("p2"))
		{
			fname = "Saade";
			lname = "Kaufmann";
		}
		if (ID.equals("p3"))
		{
			fname = "Madee";
			lname = "Armstrong";
		}
	}
}