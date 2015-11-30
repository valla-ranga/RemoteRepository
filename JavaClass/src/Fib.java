
public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f0 =0,f1 =1,z,x=0,y=0;
		for (z=1;z<=10;z++)
		{
			System.out.println("" + x);
			int sum = x+y;
			x=y;
			y=sum;
		}
	}

}
