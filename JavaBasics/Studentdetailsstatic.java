package JavaBasics;

public class Studentdetailsstatic {
	int a;
	static int b;
	int rollno;
	String name;
	static String Course = "Java Full Static";

	Studentdetailsstatic(int rn, String nm) {
		rollno = rn;
		name = nm;
		System.out.println(" Student Roll Number " + rollno + " \n Student Name " + name + " \n Student Course "+ Studentdetailsstatic.Course+"\n****");
		a++;
		b++;
	}
	

	
	public static void main(String[] args) {
		
		Studentdetailsstatic s = new Studentdetailsstatic(1,"Swapnil");
		Studentdetailsstatic s1 = new Studentdetailsstatic(2,"Sahil");
		Studentdetailsstatic s2 = new Studentdetailsstatic(3,"Soham");
		System.out.println("Object of instance counter"+s2.a);
		System.out.println("Object of Static counter"+s2.b);
	}

}
