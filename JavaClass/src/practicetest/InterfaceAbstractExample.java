package practicetest;

public class InterfaceAbstractExample extends InterfaceClass{
	
	@Override
	public void printInfo() {
		System.out.println("imlpemented method in child class");
		
	}
		
	public static void main (String[] args)
	{
		InterfaceAbstractExample iae = new InterfaceAbstractExample();
		iae.printInfo();
		iae.printName();
	}

	

}
