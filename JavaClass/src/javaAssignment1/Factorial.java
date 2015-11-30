package javaAssignment1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using Increment Operator
		int n = 5,x,y=1;
		for (x = 1; x<=n; x++)
		{
			y = x*y;
		}
		System.out.println("Factorial of "+ n + " is "+ y);
		//Using decrement Operator
		int  m = 5,p, q= 1;
		for (p = m;p >= 1;p--)
		{
			q = p*q;
		}
		System.out.println("Factorial of "+ m + " is "+ q);

	}

}
