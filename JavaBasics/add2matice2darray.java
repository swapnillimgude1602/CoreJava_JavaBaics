package JavaBasics;

public class add2matice2darray {

	public static void main(String[] args) {
		
		int a[][]={{1,3},{2,4}};  
		int b[][]={{1,3},{2,4}};
		  
		
		int c[][]=new int[2][2];
		int i,j;
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+"");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
