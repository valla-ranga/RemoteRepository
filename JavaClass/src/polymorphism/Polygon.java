package polymorphism;

public class Polygon {
	
	protected int height;
	protected int breadth;
	
	
	public Polygon(int height, int breadth) {
		super();
		this.height = height;
		this.breadth = breadth;
	}


	public void getArea(int breadth, int height)
	{
	  int result = breadth*height;
	  System.out.println(result);
	  
	}
}
