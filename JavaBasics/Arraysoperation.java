package JavaBasics;

import java.util.*;

public class Arraysoperation {

	public static void main(String[] args) {
		int a[]= {10,50,30,29,0};
		int b[]= {12,55,28,0,1};
		Arrays.sort(a);
		System.out.println("Array sorted:");
		for(int i=0;i<5;i++)
		{
		System.out.println(a[i]);
		}
		System.out.println("element at pos:"+Arrays.binarySearch(a,50)); //Binary Search
		System.out.println("Compare Method:"+Arrays.compare(b,a));
	}
	

}
