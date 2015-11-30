package javaAssignment_uni;

public class Student extends Person{
		
	public int score;
		
	public Student(String ID)
	{
		super(ID);
		printInfo();
	}
	
	public void printInfo()
	{
		if (ID == "s1")
		{
			personDetails();
			System.out.println("Student Name: "+lname+" "+fname);
			writeExam();
		}
		if (ID == "s2")
		{
			personDetails();
			System.out.println("Student Name: "+lname+" "+fname);
			writeExam();
		}
		if (ID == "s3")
		{
			personDetails();
			System.out.println("Student Name: "+lname+" "+(fname));
	     
			writeExam();
		}	
	}
	public void writeExam()
	{
		System.out.println("Exam Written");
		score = (int) (Math.random()*80)+20  ;
		if (score > 90)
		{
			System.out.println("Student "+fname+", got an A grade");
		}
		else if (score > 75 && score < 90)
		{
			System.out.println("Student "+fname+", got an B grade");
		}
		else if (score > 60 && score < 75)
		{
			System.out.println("Student "+fname+", got an C grade");
		}
		else if (score > 45 && score < 60)
		{
			System.out.println("Student "+fname+", got an D grade");
		}
		else if (score > 30 && score < 45)
		{
			System.out.println("Student "+fname+", got an E grade");
		}
		else if (score < 30)
		{
			System.out.println("Student "+fname+" failed");
		}
		System.out.println(score);
	}	
}