package javaAssignment2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Seminar s = new Seminar();
		
		s.title = "Dermatology Grand Rounds (Registered Professional only";
		s.date = "October 30th 2015";
		s.time = " 10 AM (PST)";
		System.out.println(s.title+" "+s.date+" "+s.time+" "+s.department+" "+s.person);
		
		s.print();
	}
}
