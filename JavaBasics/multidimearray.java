package JavaBasics;
import java.util.Scanner;

public class multidimearray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows");
		int r=sc.nextInt();
		System.out.println("Enter columns");
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		
		System.out.println("Enter elements:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}

		System.out.println("Display");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+"");
			}
			System.out.println();
		}	
		sc.close();
	}
}
