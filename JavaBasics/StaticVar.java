package JavaBasics;

class StaticClass
 {
	static int c;
	static void displayc()
	{
		System.out.println("VAlue of c:"+c);
	}
}
 public class StaticVar
 {
	 static int a;
	 static void display()
	 {
		 System.out.println("value of a:"+a);
	 }
int b;
void display1()
{
	System.out.println("value of b:"+b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a=10;
		display();
		StaticVar s=new StaticVar();
		s.b=15;
		s.display1();
		StaticClass.c=2;
		StaticClass.displayc();
		

	}

}
