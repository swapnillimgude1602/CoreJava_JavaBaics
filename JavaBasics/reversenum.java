package JavaBasics;
import java.util.*;
public class reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0;
		while(a!=0)
		{
			int res=a%10;
			sum=sum*10+res;
			a=a/10;
		}
		System.out.println("reverse number"+sum);
		sc.close();
	}
	

}