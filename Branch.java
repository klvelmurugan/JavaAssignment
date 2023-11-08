package Assignment;

public class Branch extends Branch_Plan {

	public void receive_Customers() {
		// TODO Auto-generated method stub
		System.out.println("Recieving Customers");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int taxpaid =0;
		Branch branch = new Branch();
		
		branch.check_accounts(1000);
		taxpaid = branch.pay_tax(2000);
		System.out.println("Tax paid = " + taxpaid);
		branch.do_interview();
		

	}

}
