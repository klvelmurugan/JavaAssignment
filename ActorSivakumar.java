package Assignment;

public class ActorSivakumar implements Actor {
	
	static String address = "coimbatore";

	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("Sivakumar acting");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("Sivakumar singing");

	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		System.out.println("Sivakumar dancing");

	}
	
	void speaking()
	{
		System.out.println("Sivakumar Speaking");
	}
	
	ActorSivakumar(int n1,String s1)
	{
		
	}

	public ActorSivakumar() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ActorSivakumar as = new ActorSivakumar(65,"audi");
		
		as.act();
		as.dance();
		as.sing();
		as.speaking();
		
		System.out.println(" Printing Address using class - " + ActorSivakumar.address);  //This prints address from ActorSivakumar
		
		Actor ac = new ActorSivakumar();  //Dynamic binding
		
		ac.act();
		ac.dance();
		ac.sing();
//		ac.speaking();  Cannnot access speaking(), because it is method of ActorSivakumar class
		
		System.out.println(" Printing Address using Dynamic Binding - " + ac.address);  //This prints address from Actor Interface
		

	}

}
