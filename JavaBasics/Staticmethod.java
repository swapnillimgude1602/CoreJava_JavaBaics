package JavaBasics;

class calculator
{
	static int add(int a,int b)
	{
		return a+b;
	}
	
	static float div(float a,float b)
	{
		return a/b;
	}
	
	int mul(int a, int b)
	{
		return a*b; 
	}
	
	String greet(String s)
	{
		return "hello "+s;
	}
}

public class Staticmethod {
	static int sub(int a,int b)
	{
		return a-b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Addition:"+calculator.add(10, 12));
System.out.println("Division:"+calculator.div(10, 12));
System.out.println("Subtraction:"+sub(10, 12));
calculator c= new calculator();
int m=c.mul(5,2);
System.out.println("Mul:"+m);
System.out.println("String method:"+c.greet("Swapnil"));


	}

}
