package assignmenr;

public class DogInterface implements AnimalInterface{

	@Override
	public void color() {
		// TODO Auto-generated method stub
		
		System.out.println("Dog color is Brown");
		
	}
	@Override
	public void breed() {
		// TODO Auto-generated method stub
		System.out.println("Dog is of Doberman");
	}
	
	public static void main (String[] args)
	{
		DogInterface di = new DogInterface();
		di.color();
		di.breed();
		
		
		
		
	}
	
	

}
