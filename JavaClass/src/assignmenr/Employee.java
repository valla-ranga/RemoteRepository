package assignmenr;

public class Employee {
	
	String name;
	int age;
	double slary;
	
	public Employee(String name)
	{
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSlary() {
		return slary;
	}

	public void setSlary(double slary) {
		this.slary = slary;
	}

	public void printEmployee()
	{
		System.out.println(name+" "+ age+" "+ slary);
	}
	
	public static void main (String [] args)
	{
		Employee e1 = new Employee("Ranganath");
		e1.age = 25;
		e1.slary = 86546845;
		e1.printEmployee();
		
	}
}
