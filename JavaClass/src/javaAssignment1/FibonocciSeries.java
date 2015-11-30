package javaAssignment1;

public class FibonocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f0 = 0, f1 = 1, f2 = 1,n =10;
		for (int i =1;i<n;i++)
		{
			f2 = f1+f2;
			f0 = f1;
			f1 = f2;
			System.out.println(f2);
		}
		
	}

}
