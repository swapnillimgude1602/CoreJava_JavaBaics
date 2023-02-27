package JavaBasics;
import java.util.*;

public class Amstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int no=sc.nextInt();
		int origno=no;
		int rem = 0 ;
		while(no!=0)
		{
			int sum=no%10;
			rem+=Math.pow(sum,3);
			no=no/10;
		}
		
		if(origno==rem)
		{
			System.out.println("Y");

		}
		else
		{
			System.out.println("N");

		}	
		sc.close();
	}
	
}
