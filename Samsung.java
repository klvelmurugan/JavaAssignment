package Assignment;

public class Samsung extends FactoryDemo {

	@Override
	void verifyFingerPrint() {
		// TODO Auto-generated method stub
		
		System.out.println("Verifying Fingerprint in Samsung class");

	}

	@Override
	void providePattern() {
		// TODO Auto-generated method stub
		
		System.out.println("Provide Pattern in Samsung class");

	}

	static int price=5000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Samsung sam = new Samsung();
		sam.browse();
		System.out.println("Samsung price = " + sam.price);
		System.out.println("Samsung price = " + FactoryDemo.price);
	}
	
	

}
