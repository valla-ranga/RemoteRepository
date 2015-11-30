package inheritance;

public class Cat extends Animal{
	
	public String catbreed;
	public String catlooks;
	
	public Cat(String catbreed) {
		super.type=catbreed;
		this.catbreed = catbreed;
		}
	public void printCatBreed()
	{
		System.out.println("Type of breed is "+ this.catbreed);
	}
}