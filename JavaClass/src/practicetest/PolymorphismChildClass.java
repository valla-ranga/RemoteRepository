package practicetest;

public class PolymorphismChildClass extends Polymorphism{
	
	public int add(double a,int b){
		 this.a = a;
		 this.b = b;
		 c = (int) (a+b);
		 return c;
	 }
	public int add(int a,int b){
		 this.a = a;
		 this.b = b;
		 c = a+b;
		 return c;
	 }
	
	public static void main(String[] args)
	{
		PolymorphismChildClass p = new PolymorphismChildClass();
		p.add(3, 3);
		System.out.println(p.c);
	}

}
