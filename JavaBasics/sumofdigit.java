package JavaBasics;
import java.util.*;
public class sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0;
		while(a!=0)
		{
			int res=a%10;
			sum=sum+res;
			a=a/10;
		}
		System.out.println("Sum of digit"+sum);
		sc.close();
		}
	

}
