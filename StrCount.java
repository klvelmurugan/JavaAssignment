package learning;

public class StrCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String name = "murugan1234@gmail.com"; 
          int n1=0,n2=0,n3=0;
		  for(int i=0; i<name.length();i++)
		  {
			  char ch = name.charAt(i);
			  if(ch>='a' && ch<='z')
			  {
				  n1++;
			  }
			  else if(ch>='0' && ch<='9')
			  		{
				  		n2++;
			  		}
			  else
			  {
				  n3++;
				  
			  }
			  }
		  System.out.println(" Count of alphabets = " + n1);
		  System.out.println(" Count of numbers = " + n2);
		  System.out.println(" Count of spl chars = " + n3);


	}

}
