package JavaBasics;

public class gcFinalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Hello");
		gcFinalize gf = new gcFinalize();
		gf=null;
		s=null;
		System.gc();
		System.gc();	
		System.out.println("Main method");
	}
	@Override
	protected void finalize() throws Throwable
	{
		//super.finalize();	//
		System.out.println("finalize mehpod");
	}

	}
