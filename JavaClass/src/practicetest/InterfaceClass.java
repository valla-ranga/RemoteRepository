package practicetest;

public abstract class InterfaceClass implements InterfaceExample{

		/* 
		 * Classes can implement any number of interfaces; if a class implementing an interface is abstract, it 
		 * is not mandated to implement abstract methods from interface; however, if not abstract, it needs to 
		 * implement interface abstract methods.
		 * 
		 */
	
	public void printName()
	{
		System.out.println("Printing from ABstract Class " +name+" "+ number);
	}
	
	

}
