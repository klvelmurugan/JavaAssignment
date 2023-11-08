package bank.chennai;

public class AccountHolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI sb = new SBI();
		sb.empId = "1";
		sb.empName = "Vijay";
		
		sb.create_account();
		sb.get_loan(10000);
		
		System.out.println(" Emp id = " + sb.empId);
		System.out.println("Emp name = " + sb.empName);
		System.out.println("Branch name = " + SBI.branch_name);

	}

}
