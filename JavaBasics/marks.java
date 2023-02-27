package JavaBasics;
import java.util.*;

public class marks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter marks:");
		int mrk=sc.nextInt();
		if(mrk>=70)
		{
			System.out.println("marks greater than 70:");

		}
		else if(mrk>=50 || mrk<=70)
		{
			System.out.println("marks in between 50&70");

		}
		else
		{
			System.out.println("fail marks<20");

		}
		sc.close();
	}
	

}
