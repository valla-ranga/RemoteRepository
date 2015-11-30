package bank;

public class Customer {
	public static int count = 0;
	private String accname;
	private int accno;
		
	public Customer(){
		accno = ++count;
	}
	public Customer(String accname, int accno) 
	{
		
		Person p1 = new Person("Jill","Irwing,Texas",123);
		accno = ++count;
		//this.accno = accno;
		accname = p1.getName();
		String address = p1.getAddress();
		System.out.println(" "+accname +"\n "+ address +"\n "+ accno +"\n "+ p1.getPhnumber());
	}
	public String getAccname() {
		return accname;
	}
}