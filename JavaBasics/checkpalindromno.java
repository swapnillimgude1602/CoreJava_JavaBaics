package JavaBasics;
import java.util.*;
public class checkpalindromno {

	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int temp=a;
		int sum=0;
		while(a!=0)
		{
			int res=a%10; 
			sum=sum*10+res;
			a=a/10;
		}
		
		if(temp==sum)
			{
			System.out.println("Number is palindrom");
			}
		else
		{
			System.out.println("Number is not palindrom");	
		}
		sc.close();
	}
	
	

}