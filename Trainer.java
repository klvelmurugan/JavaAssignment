package Assignment;

public class Trainer {

	String dept = "Java";
	String institute = "Payilagam";
	private int salary = 10000;
	
	Trainer()
	{
		
	}
	Trainer(String s1,String s2)
	{
		this.dept=s1;
		this.institute=s2;
	}
	
	int get_salary()
	{
		return this.salary;
	}
	
	void training()
	{
		System.out.println("Training in Payilagam");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trainer trainerKumar = new Trainer("CSE","payilagam");
		
		System.out.println("Kumar dept = " + trainerKumar.dept);
		System.out.println("Kumar institute = " + trainerKumar.institute);
		System.out.println("Kumar Salary = " + trainerKumar.salary);

	}

}
