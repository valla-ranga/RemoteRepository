package polymorphism;

public class Triangle extends Polygon{
	
	
		
		public Triangle(int height, int breadth) {
		super(height, breadth);
		// TODO Auto-generated constructor stub
	}

		// TODO Auto-generated constructor stub
	
	

	public int area;
	
	public void getArea(double breadth, double height)
	{
		
	double result=(breadth*height)/2;
	System.out.println(result);
	
	}
	
}
