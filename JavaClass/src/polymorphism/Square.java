package polymorphism;

public class Square extends Polygon{
	
	int side;

	public Square(int height, int breadth) {
		super(height, breadth);
		// TODO Auto-generated consructor stub
	}
	public int getArea(){
		return side * side;
	}
	
}
