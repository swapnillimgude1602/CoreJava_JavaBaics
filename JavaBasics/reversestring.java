package JavaBasics;

import java.util.Scanner;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		for(int i=str.length();i>0;i--)
		{
			System.out.print(str.charAt(i-1));
		} 
		sc.close();
		}

}
