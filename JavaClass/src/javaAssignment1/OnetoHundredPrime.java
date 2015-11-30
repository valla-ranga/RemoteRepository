package javaAssignment1;

public class OnetoHundredPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for (i =2;i<=100;i++)
		{
			boolean isPrime = true;
			for (int j =2;j<i;j++)
			{
				if (i%j == 0)
				{
					isPrime = false;
					break;
				}
			}
			if (isPrime)
			{
				System.out.print(i + ",");
			}
		}

	}
	

}
