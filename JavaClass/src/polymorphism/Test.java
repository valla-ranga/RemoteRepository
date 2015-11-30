package polymorphism;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h,b;
		h=2;
		b=3;
		Polygon p=new Polygon(h,b);
		Triangle t = new Triangle(h,b);
		Rectangle R = new Rectangle(h,b);
		Square s = new Square(h,b);
		p.getArea(h, b);
		t.getArea(h,b);
		R.getArea(h,b);
		s.getArea(h,b);


	}

}
