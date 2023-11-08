package Assignment;

public abstract class FactoryDemo extends Smartphone {

	@Override
	int call(int seconds) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void sendMessage() {
		// TODO Auto-generated method stub

	}

	@Override
	void receiveCall() {
		// TODO Auto-generated method stub

	}
	
	abstract void verifyFingerPrint();
	abstract void providePattern();
	
	void browse()
	{
		System.out.println("FactoryDemo Browsing");
	}
	
	Boolean isOriginalPiece = false;
	static int price=0;
	

}
