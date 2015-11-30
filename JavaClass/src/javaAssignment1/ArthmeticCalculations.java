package javaAssignment1;

public class ArthmeticCalculations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 50;
		int y = 10;
		System.out.println("Addition : " + Math.addExact(x, y));
		System.out.println("Addition : "+  (x+y));
		System.out.println("Subtraction : "+Math.subtractExact(x, y));
		System.out.println("Subtraction : "+ (x-y));
		System.out.println("Multiplication : " + Math.multiplyExact(x, y));
		System.out.println("Multiplication : " + (x*y));
		System.out.println("Division : "+ Math.floorDiv(x, y));
		System.out.println("Division : "+ (x/y));
	}

}
