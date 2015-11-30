package javaAssignment1;

public class ReverseofaString {

	public static void main(String[] args) {
		String original = "ranganath", reverse ="";
		int x = original.length();
		for (int i = (x-1);i>=0;i--)
		{
			reverse = reverse + original.charAt(i);
		}
		System.out.print(reverse);
	}
}
