package org.tcs;

import java.util.ArrayList;
import java.util.List;

public class ListClass {
	public static void main(String[] args) {
		
		
		List li = new ArrayList();
		
		li.add(10);
		li.add("java");
		li.add(234.45);
		li.add('m');
		li.add(false);
		li.add(10);
		li.add(null);
		
		// to iterate all the values in the list using normal for loop
		for (int i = 0; i < li.size(); i++) {
		System.out.println(li.get(i));	
		}
		
		
		// to iterate all the values in the list using enhanced for loop
		
		
		for (Object x : li) {
			System.out.println(x);
		}
		
		
		
	}

}
