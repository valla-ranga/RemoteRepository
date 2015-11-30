package javaAssignment1;

public class RevereseofaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int original = 35745186, reverse = 0, temp;	
		
		while (original !=0)
		{
			reverse = reverse * 10;
			reverse = reverse + original%10;
			original = original/10;
		}
		System.out.println(reverse);
	}

}
