package oops;

public class Persons {
	public String fname;
	public String lname;
	public String address;
	public String gender;
	private int phnumber;
	int yearofBirth;
	int currentYear;

	public Persons(String fname, String lname)
	{
		 String name = fname +" "+ lname;
		System.out.println(name);
		return;
	}
	public String getAddress()
	{
		String Address = address;
		return Address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int Age() 
	{
		int age;
		age = this.currentYear-this.yearofBirth;
		return age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getPhnumber() {
		return phnumber;
	}
	public void setPhnumber(int phnumber) {
		this.phnumber = phnumber;
	}
	public int getYearofBirth() {
		return yearofBirth;
	}
	public void setYearofBirth(int yearofBirth) {
		this.yearofBirth = yearofBirth;
	}
	public int getcurrentYear() {
		return yearofBirth;
	}
	public void setcurrentYear(int year) {
		this.currentYear= year;
	}
	
	
}