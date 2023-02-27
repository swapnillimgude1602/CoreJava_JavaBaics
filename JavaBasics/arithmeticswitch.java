package JavaBasics;
import java.util.*;
public class arithmeticswitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n 5.Mod");
		
		int ch = 0;
		while(ch<6)
		{
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		
		switch(ch)
			{
			case 1:
				System.out.println("Enter the numbers:");
				int a=sc.nextInt();
				int b=sc.nextInt();
				int c=a+b;
				System.out.println("Additon of"+a+" & " +b+" is "+c);
				break;
			
			case 2:
				System.out.println("Enter the numbers:");
				int d=sc.nextInt();
				int e=sc.nextInt();
				int f=d-e;
				System.out.println("Subtraction of"+d+" & " +e+" is "+f);
				break;
				
			case 3:
				System.out.println("Enter the numbers:");
				int g=sc.nextInt();
				int h=sc.nextInt();
				int i=g*h;
				System.out.println("Multiplication of"+g+" & " +h+" is "+i);
				break;
				
			case 4:
				System.out.println("Enter the numbers:");
				int j=sc.nextInt();
				int k=sc.nextInt();
				int l=j/k;
				System.out.println("Division of"+j+" & " +k+" is "+l);
				break;
				
			case 5:
				System.out.println("Enter the numbers:");
				int m=sc.nextInt();
				int n=sc.nextInt();
				int o=m%n;
				System.out.println("Additon of"+m+" & " +n+" is "+o);
				break;
	default:
				System.out.println("Enter valid Choice");
				continue;
			
	}
		
		
}
		sc.close();
}
}

