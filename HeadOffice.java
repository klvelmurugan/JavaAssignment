package Assignment;

public abstract class HeadOffice {
	
	public void check_accounts(int amount)
	{
		System.out.println ("Check accounts");
	}
	
	public int pay_tax(int amount)
	{
	   
		System.out.println("Paying tax");
		return amount;
		
	}
	
	public abstract void receive_Customers();

}
