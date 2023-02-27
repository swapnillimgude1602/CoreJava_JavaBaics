package JavaBasics;

public class learnerconstrtypes {

	int rollNo;
	String name,course;
	//Default
	private learnerconstrtypes() {
		System.out.println("default constructor");
	}

	//Parameterized
	learnerconstrtypes(int rollNo) {
		this.rollNo = rollNo;
		System.out.println("Learner rollNo is:" + rollNo);
	}
	learnerconstrtypes(String nm,String c) {
		name=nm;
		course=c;
		System.out.println("Learner name and course:" + name+"and"+course );
	}
	
	//Copy
	learnerconstrtypes(learnerconstrtypes l) {
		name=l.name;
		course=l.course;
		System.out.println("Learner name and course:" + name+"and"+course );
	}
	void display() {
		System.out.println("method called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		learnerconstrtypes l = new learnerconstrtypes();
		l.display();
		learnerconstrtypes l1 = new learnerconstrtypes(10);
		learnerconstrtypes l2=new learnerconstrtypes("Swapnil","Java Development");
		learnerconstrtypes l3 = new learnerconstrtypes(l2);

	}

}


