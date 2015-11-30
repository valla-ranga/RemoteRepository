package inheritance;

public class Test {

	public static void main(String[] args) {
				
		Cat C = new Cat("cat");
		C.name = "Meow";
		C.color = "white";
		C.type = "Carnivorous";
		C.action = "meow meow";
		System.out.println("Accessing Cat Object through Animal");
		C.printname();
		System.out.println("Printing cat method");
		C.printCatBreed();
		
		Animal cat = new Cat("Persian Cat");
	    cat.printname();
	    System.out.println("Accessing parent class method in sub class");
		cat.makeNoise();
		
		Animal D = new Dog("Chocolate","Dog","Black","Omnivorous","Bowbow","Doberman");
		System.out.println("Accessing Dob object through Animal");
		D.printname();
		System.out.println("Accessing parent class method in sub class");
		D.makeNoise();
		
		/*Animal S = new shadow("Shadow","brown","Omnivorous","Bubu","Germanshepard","Cute", "Ranga");
		((Dog) S).makeNoise();
		*/
	}
}