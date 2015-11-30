package javaAssignment2;

public class Person {
	
	public String name;
	public String type;
	private String phnumber;
	private String email;
	
	public Person(String name, String type) {
		
		this.name = name;
		this.type = type;
	}
	public void print()
	{
		System.out.println(""+this.name+this.type);
	}
	

}
