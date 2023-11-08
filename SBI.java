package bank.chennai;

public class SBI {
	
// making all fields and methods public, so that it can be accessed from bank.madurai
	
	public String empName, empId; 
	public static String branch_name = "chennai"; // single quote didnt work
	
	public void get_loan(int amount)
	{
		System.out.println("Getting Loan");
	}
	
	public void create_account()
	{
		System.out.println("Creating account");
	}

}
