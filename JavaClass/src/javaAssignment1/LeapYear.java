package javaAssignment1;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2000;
		
		if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0))
		{
			System.out.println("year "+ year + " is a leap year");
		}
		else System.out.println("year "+year + "is not a leap year");
	}
}
