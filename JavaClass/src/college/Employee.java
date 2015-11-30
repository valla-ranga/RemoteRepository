package college;

public class Employee extends Person{
	
	public String designation;
	public int salary;
		
	public Employee(int ID)
	{
		if(ID==1)
		{
			Person p1 = new Person("Jeff",28, "Sioux Falls SD");
			this.designation = "Admin"; 
			this.salary = 30000;
			System.out.println("Employee name : "+ p1.name + " Employee age :" + p1.age + "Employee address : " 
		                       + p1.address+ " Employee designation : " + designation +" Employee salary : "+ salary );
		}
		if(ID==2)
		{
			Person p2 = new Person("peter",35, "Minneapolis, MN");
			this.designation = "Asst. Prof"; 
			this.salary = 50000;
			System.out.println("Employee name : "+ p2.name + " Employee age : " + p2.age + " Employee Address : " 
                    + p2.address+ " Employee Designation : " + designation +" Employee salary : "+ salary );
		}
	}
}
