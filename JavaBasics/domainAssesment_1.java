package JavaBasics;
import java.util.*;
public class domainAssesment_1 {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter rows:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	
	
	if(a<10&&a>0)
	{
		for(int i=1;i<=a;i++)
		{
			for(int j=i;j<a;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	if(b<10 && b>0)
	{
		for(int i=1;i<=b;i++)
		{
			for(int j=i;j<b;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	if(c<10 && c>0)
	{
		for(int i=1;i<=c;i++)
		{
			for(int j=i;j<c;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	
	
	//logic 2
	Scanner scanner = new Scanner(System.in);

	// Get the number of rows from the user
	System.out.println("Enter the numbers to print the pattern :");
	int A = scanner.nextInt();
	int B = scanner.nextInt();
	int C = scanner.nextInt();
//	System.out.println(a + " " + b + " " + rows );

	for (int i = 1; i <= A; i++) {
		for (int j = A; j > i; j--) {
			System.out.print(" ");
		}

		for (int k = 1; k <= i; k++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	for (int i = 1; i <= B ; i++) {
		for (int j = B; j > i; j--) {
			System.out.print(" ");
		}

		for (int k = 1; k <= i; k++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	for (int i = 1; i <= C ; i++) {
		for (int j = C; j > i; j--) {
			System.out.print(" ");
		}

		for (int k = 1; k <= i; k++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	}
}