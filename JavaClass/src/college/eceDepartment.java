package college;

public class eceDepartment extends Department {
	
	protected void dptmntdetails()
	{
		// TODO Auto-generated constructor stub
		deptname = "ece";
		deptID = 2;
	    System.out.println("in ece "+" deptname"+deptname+" deptid" +deptID);
		System.out.println("Calling Employee in ECE");
		e = new Employee(2);
		System.out.println("Calling Student in ECE");
		s = new Student(4);
	}

}
