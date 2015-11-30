package bank;

public class Employee {
	public static int count = 0;
	private String ename;
	private int eid;
	private String address;
	
	public Employee(){
		eid = ++count;
	}
	public Employee(int eid) {
		eid=++count;
		Person p2 = new Person("Jack","Frisco,Texas", 563);
		this.ename = p2.getName();
		this.eid = eid;
		System.out.println(" "+ ename+ "\n "+ eid+ "\n "+ p2.getAddress()+ "\n"+p2.getPhnumber());				
	}
}
