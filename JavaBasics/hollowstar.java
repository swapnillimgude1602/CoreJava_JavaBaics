package JavaBasics;


import java.util.Scanner;

public class hollowstar {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.print("Enter Hollow Right Angled Triangle Pattern Rows = ");
		int rows = sc.nextInt();
		
		System.out.println("Hollow Right Angled Triangle Star Pattern");
		
		for (int i = 1 ; i <= rows; i++ ) 
		{
			for (int j = 1 ; j <= i; j++ ) 
			{
				if(i == 1 || i == rows || j == 1 || j == i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}