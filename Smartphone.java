package Assignment;

public abstract class Smartphone {
	
	 abstract int call(int seconds);
	 abstract void sendMessage();
	 abstract void receiveCall();
	 void browse()
	 {
		 System.out.println("Smartphone browsing");
	 }

	 public Smartphone()
	 {
		 System.out.println("Smartphone under development");
	 }

}
