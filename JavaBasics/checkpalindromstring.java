package JavaBasics;

import java.util.Scanner;

public class checkpalindromstring {

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
/*
StringBuffer sb=new StringBuffer("str");
sb.reverse();
StringBuffer revstr=sb;

if(sb.equals(revstr))
{
	System.out.println("String is palindrom");
}
else
{
	System.out.println("String is not palindrom");

}
}
}

if(str.equalsIgnoreCase(revstr))
{
	System.out.println("String is palindrom");
}
else
{
	System.out.println("String is not palindrom");

}
*/