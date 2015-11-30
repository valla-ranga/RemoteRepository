package bank;

public class Bank {
	
	private String bankName;
	private String bankAddress;
	private int numberofAccounts;
	Employee employee;

	public Bank(String bankName, String bankAddress, int numberofAccounts)
	{
		this.bankName = bankName;
		this.bankAddress = bankAddress;
		this.numberofAccounts = numberofAccounts;
		
		Customer customer1  = new Customer("Ranga", 123);
		
		employee  = new Employee(685);	
	}
}
