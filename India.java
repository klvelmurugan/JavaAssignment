package Assignment;

public abstract class India {

	static String capital = "New Delhi";
	abstract void speakLanguage();
	abstract void eat();
	abstract void dress();
	
	India()
	{
		
	}
	
	public India(String primeMinister)
	{
	System.out.println("our Prime Minister is" + primeMinister);
	}


}
