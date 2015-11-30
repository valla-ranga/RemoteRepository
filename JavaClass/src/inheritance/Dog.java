package inheritance;

public class Dog extends Animal
{
	public String dogbreed;
	public String doglooks;
	
	public Dog(String name, String type, String color, String action, String dogbreed, String doglooks){
		super(name,type,color,action);
		this.dogbreed = dogbreed;
		this.doglooks = doglooks;		
	}
		public void printDogBreed()
		{
			System.out.println("Type of breed is "+ this.dogbreed);
		}
		public void printname(){
			System.out.println(name+" is a "+ type+" of color "+ color+" which is an "+action+ " barks as "+dogbreed
					                  +" and looks "+doglooks);
		}
		public void makeNoise()
	     {
	          System.out.println(" My dog name is " + name+ "and it says Woof Woof!");
	     }
}