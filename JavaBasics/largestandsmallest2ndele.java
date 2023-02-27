package JavaBasics;

import java.util.Arrays;

public class largestandsmallest2ndele {
	int SecondLargest(int[] a, int k,int len) {
		Arrays.sort(a);
		int len1 = a.length;
		int sum=(a[len1 - k]+ a[k - 1]);
		return sum;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		largestandsmallest2ndele l = new largestandsmallest2ndele();
		int len = a.length;
		System.out.println(l.SecondLargest(a, 2 , len));
		
	
	}

}
