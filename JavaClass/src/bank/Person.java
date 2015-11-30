package bank;

public class Person {
	private String name;
	private String address;
	private int phnumber;
	public Person(String name, String address, int phnumber) {
	    
		this.name = name;
		this.address = address;
		this.phnumber = phnumber;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhnumber() {
		return phnumber;
	}
	public void setPhnumber(int phnumber) {
		this.phnumber = phnumber;
	}
			 
}

