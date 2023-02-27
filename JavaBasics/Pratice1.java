package JavaBasics;

import java.util.Scanner;

public class Pratice1 {
	int findsumofrem(int n,int div)
	{
		int rem=0;
		for(n=1;n<=12;n++)
		{
			rem=rem+(n%div);
		}
	System.out.println(rem);
	return rem;
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pratice1 p = new Pratice1();
		System.out.println("Enter div:");
		Scanner sc = new Scanner(System.in);
		
		int div = sc.nextInt();
		System.out.println("Enter no:");
		
		int n = sc.nextInt();
		p.findsumofrem(n, div);
		
		
	}
	
	
	}

