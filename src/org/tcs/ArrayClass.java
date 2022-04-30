package org.tcs;

public class ArrayClass {

	public static void main(String[] args) {
		long a=9292929292l;
		int count=0;
		while (a>0) {
			a=a/10;
			count++;
		}
		if (count!=10) {
			System.out.println("invalid");
		}
		else {
			System.out.println("valid");
		}
		
	}
	
}
