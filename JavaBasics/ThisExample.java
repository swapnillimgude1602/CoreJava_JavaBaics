package JavaBasics;

public class ThisExample {
	public int getA() {											//method 2
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	int a;
//	public ThisExample(int a) {									//method 1
//		// TODO Auto-generated constructor stub
//		this.a=a;
//		System.out.println("a"+this.a);
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisExample T =new ThisExample();
		T.setA(50);
		System.out.println("value of a="+T.getA());
	}

}
