package polymorphism;

public class Rectangle extends Polygon{
	int area;
	
	public Rectangle(int height, int breadth) {
		super(height, breadth);
		// TODO Auto-generated constructor 	
	}
	public int getArea(){
		area = height * breadth;
		return area;
	}
}
	
