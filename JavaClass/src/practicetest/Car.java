package practicetest;

public class Car extends Vehicle{

	public String model;
	
	public Car(String name, String type, String model) {
		super(name, type);
		this.model = model;		
	}
	
	public void carInfo()
	{
		vehicleInfo();
		System.out.println("Car Model : "+ model);
	}

}
