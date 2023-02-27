package JavaBasics;
import java.util.*;
public class accessanddisparray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int n=5;
		System.out.println("Enter array elements:");// TODO Auto-generated method stub
		for(int i=0;i<=n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("Display");
		for(int i=0;i<=n;i++)
		{
			System.out.println("Array elements are"+a[i]);
			
		}
		sc.close();
		
	}

}
