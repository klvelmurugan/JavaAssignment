package Assignment;

public class TamilNadu extends SouthIndia {

	
	
	public TamilNadu() {
		// TODO Auto-generated constructor stub
	}

	void speakLanguage() {
		// TODO Auto-generated method stub
		
		System.out.println("Tamil language");

	}

	void eat() {
		// TODO Auto-generated method stub
		
		System.out.println("Idly and Dosai");

	}


	void dress() {
		// TODO Auto-generated method stub
		
		System.out.println("Saree and Veshti");

	}
	
	static String capital = "Chennai";
	
	void cultivate()
	{
		System.out.println("Rice and Sugarcane");
	}
	
	void livingStyle()
	{
		System.out.println("Above Average Development");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("India Capital = " + India.capital);
		
		System.out.println("TN Capital = " + TamilNadu.capital);
		
		SouthIndia si=new TamilNadu();
		
		si.cultivate();
		si.dress();
		si.eat();
		si.livingStyle();
		si.speakLanguage();
		
	}

}
