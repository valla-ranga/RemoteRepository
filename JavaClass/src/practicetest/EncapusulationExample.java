package practicetest;

public class EncapusulationExample {
	
	private String name;
	private int id;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void printInfo()
	{
		System.out.println("Name : "+name+" "+"ID : "+id);
	}
	
	

}
