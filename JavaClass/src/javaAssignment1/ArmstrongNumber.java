package javaAssignment1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 371,temp,sum = 0,remainder, digits =0;
		
		temp = n;
		while (temp !=0)
		{
			digits++;
			temp = temp/10;
		}
		System.out.println(digits);
		temp = n;
		
		while (temp !=0)
		{
			remainder = temp%10;
			sum = sum + (int) Math.pow(remainder, digits);
			temp = temp/10;
		}
		if (n == sum)
		{
			System.out.println(n +" is an Armstrong Number");
		}
		else 
		{
			System.out.println(n+" is not an Armstong Number");
		}
		
	}

}
