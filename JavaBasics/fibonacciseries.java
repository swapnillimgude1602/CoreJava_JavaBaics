package JavaBasics;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int a=0,b=1;
		System.out.print(a+""+b);
		for(i=2;i<=10;i++)
		{
			int c=a+b;
			System.out.print(c);
			a=b;
			b=c;
		}

	}

}
