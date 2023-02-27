package JavaBasics;

import java.util.Scanner;

public class DudeneyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int no=sc.nextInt();
		int origno=no;
		int rem = 0;
		while(no!=0)
		{
			int sum=no%10;
			rem=rem+sum;	
			no=no/10;
			
		}
		int dud=(int) Math.pow(rem,3);
		System.out.println(dud);
		
		if(dud==origno) {
			System.out.println("Dudeney no");
		}
		else
		{
			System.out.println(" Not Dudeney");
		}
		sc.close();
	}

}
