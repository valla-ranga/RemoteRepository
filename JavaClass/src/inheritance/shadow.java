package inheritance;

public class shadow extends Dog {
	
	public String dogOwner;
	
	public shadow(String name, String type, String color, String action, String dogbreed, String doglooks, String dogOwner) 
	{
		super(name, type, color, action, dogbreed, doglooks);
		this.dogOwner = dogOwner;
		// TODO Auto-generated constructor stub
	}
	public void printDogBreed()
	{
		System.out.println(" bu bu");
	}
	public void makeNoise()
    {
         System.out.println("bow bow");
    }
}
