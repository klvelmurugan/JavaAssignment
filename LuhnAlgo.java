package Assignment;

import java.util.ArrayList;

public class LuhnAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList cc = new ArrayList();
		cc.add(4); cc.add(4); cc.add(0); cc.add(5);
		cc.add(2); cc.add(3); cc.add(4); cc.add(8);
		cc.add(7); cc.add(8); cc.add(8); cc.add(5);
		cc.add(3); cc.add(9); cc.add(4); cc.add(1);
		
		System.out.println(cc);
		
		//Multiply every other number by 2
		
		for(int i=0;i<16;i=i+2)
		{
			Integer c = (Integer) cc.get(i);
			c=c*2;
			cc.set(i, c);
						
		}
		System.out.println(cc);
		//After multiplying by 2 
		
		int div=0,rem=0;
		
		for(int i=0;i<16;i=i+2)
		{
			Integer c = (Integer) cc.get(i);
			if(c>9)
			{
				rem=c%10;
				div=c/10;
				c=rem+div;
				cc.set(i,c);
			}
		}
		
		System.out.println(cc);
		
		//Summing all digits
		int total=0;
		
		for(int i=0;i<16;i=i+1)
		{
			Integer c = (Integer) cc.get(i);
			total=total+c;
		}
		
		System.out.println("Total = " + total);
		
		total=total%10;
		
		if(total == 0)
		{
			System.out.println("Valid Credit card");
		}
		else
		{
			System.out.println("Not a valid Credit card");
		}
		
	}

}
