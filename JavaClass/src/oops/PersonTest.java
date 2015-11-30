package oops;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int birthyear,currentyr;
		
		String fname = "Ranganath";
		String lname = "Vallakati";
		Persons p1 = new Persons( fname,lname);
	
		p1.address = "Frisco, TX";
		currentyr = 2015;
		birthyear = 1991;
		p1.setcurrentYear(currentyr);
		p1.setYearofBirth(birthyear);
	    p1.Age();
		p1.gender = "Male";
		p1.setPhnumber(408);
		System.out.println(p1.address);
		System.out.println(p1.Age());
		System.out.println(p1.gender);
		System.out.println(p1.getPhnumber());
		
	}

}
