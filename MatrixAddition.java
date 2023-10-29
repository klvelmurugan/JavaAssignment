package learning;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] m1 = new int[5][5];
		int[][] m2 = new int[5][5];
		int[][] m3 = new int[5][5];
		
		//Assigning values to individual Array element in m1 and m2
		
		System.out.println("Adding Matrix");
		
		for(int i=0;i<m1.length;i=i+1)
		{
			for(int j=0;j<m1[i].length;j++)
			{
				m1[i][j]=1;
				m2[i][j]=4;
			}
		}
		
		//Adding m1 and m2 matrix
		
		for(int i=0;i<m1.length;i=i+1)
		{
			for(int j=0;j<m1[i].length;j++)
			{
				m3[i][j]= m1[i][j] + m2[i][j];
				
			}
		}
		
		//printing the added matrix
		
		for(int i=0;i<m3.length;i=i+1)
		{
			for(int j=0;j<m3[i].length;j++)
			{
				System.out.print(m3[i][j] + " ");
				
			}
			System.out.println();
		}
		
			

	}

}
