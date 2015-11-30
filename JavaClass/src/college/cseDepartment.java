package college;

public class cseDepartment extends Department {
	
protected static Integer deptID = 1;

	protected void dptmntdetails() {
		// TODO Auto-generated method stub
		deptname = "cse";
		deptID = 1;
		
		System.out.println("In department1 object, " +deptname+", ID: " +deptID);
		System.out.println("Calling Employee in CSE");
		e = new Employee(1);
		System.out.println("Calling Student in CSE");
		s = new Student(3);	
	}
}
