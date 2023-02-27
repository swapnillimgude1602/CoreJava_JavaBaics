package JavaBasics;
import java.util.*;
public class nestedforstar {
	//hollow triangle
public static void main(String args[])
{
	
	int n, i, j, space = 1;
	System.out.println("Enter the number of rows: ");
	Scanner s = new Scanner(System.in);
	n = s.nextInt();
	space = n - 1;
	for (j = 1; j<= n; j++)
	{
		for (i = 1; i<= space; i++)
		{
		System.out.print(" ");
		}
		space--;
		for (i = 1; i <= 2 * j - 1; i++)
		{
		System.out.print("*");
		}
		System.out.println("");
	}
	}
	
}

/*left triangle

	for(int i=0;i<5;i++)
	{
		System.out.println();
		for(int j=0;j<=5;j++)
		{
			System.out.print("*");
		}
	}
	// TODO Auto-generated method stub

}

}*/

/* right triangle
int size = 5;
for (int i = 0; i < size; i++) {
// print spaces
for (int j = 1; j < size - i; j++) {
System.out.print(" ");
}
// print stars
for (int k = 0; k <= i; k++) {
System.out.print("*");
}
System.out.println();
}
}
}


int n, i, j, space = 1;
System.out.println("Enter the number of rows: ");
Scanner s = new Scanner(System.in);
n = s.nextInt();
space = n - 1;
for (j = 1; j<= n; j++)
{
	for (i = 1; i<= space; i++)
	{
	System.out.print(" ");
	}
	space--;
	for (i = 1; i <= 2 * j - 1; i++)
	{
	System.out.print("*");
	}
	System.out.println("");
}
}

int size = 5;
	for (int i = 0; i < size; i++) {
	  // print spaces
	  for (int j = 0; j < size - i - 1; j++) {
	    System.out.print(" ");
	  }
	  // print stars
	  for (int k = 0; k < 2 * i + 1; k++) {
	    System.out.print("*");
	  }
	  System.out.println();
	}
	}
	

*/
