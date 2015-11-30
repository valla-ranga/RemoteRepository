package college;

public class University {
	public static String address = "Grand Forks, ND"; 
	public String universityName;
	public String noofStudents;
	Department d = new cseDepartment();
	Department d1 = new eceDepartment();
	public University(String universityName)
	{
		this.universityName = universityName;	
	}
	public void print()
	{ 	
		System.out.println(" " +universityName );
		System.out.println("Step 2, calling department1 , CSE");
		d.dptmntdetails();
		System.out.println("Step 3, calling department2 , ECE");
		d1.dptmntdetails();    
	}
} 
