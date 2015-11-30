package practicetest;

public class Vehicle {
	
	public String name;
	public String type;
	
	
	public Vehicle(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	public void vehicleInfo()
	{
		System.out.println("Name of Vehicle : "+name+", "+"Type of Vehicle : "+type);
	}
	
	

}
