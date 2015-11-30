package inheritance;

public class Animal {
	public String name;
	public String type;
	public String color;
	public String action;
	
	public Animal(){
		
	}
		public Animal(String name, String type, String color, String action) {
		this.name = name;
		this.type = type;
		this.color = color;
		this.action = action;
	}
	public void printname(){
		System.out.println(name+" is a "+ type+" of color "+ color+" which is an "+action);
	}
 	public void makeNoise()
    {
         System.out.println("Roars");
    }   
}