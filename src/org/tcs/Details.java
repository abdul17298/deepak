package org.tcs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Details {

	
 /**
 * @param args
 */
public static void main(String[] args) {
	
	 
	 List li = new ArrayList();
	 
	li.add(10);
	li.add("java");
	li.add(234.45);
	li.add('m');
	li.add(false);
	li.add(10);
	li.add(null);
	
	 
	 
	 // to print all the values in the list
	 System.out.println(li);
	 
	 // to find the size of the list 
         int Size = li.size();
         System.out.println(Size);
         
     // to find the value by passing the index
         Object obj = li.get(3);
         System.out.println(obj);
         
     // to add a value by passing the index
         li.add(2, 111);
         System.out.println(li);
         
     // to remove a value by passing the index
         li.remove(7);
         System.out.println(li);
         
     // to replace a value by passing the index
         li.set(5, "ravi");
         
     // to find the index position of the given value 
        int indexOf = li.indexOf(10);
        System.out.println(indexOf);
        
     // to find the last  occurance of the given value 
        int lastIndexOf = li.lastIndexOf(10);
        System.out.println(lastIndexOf);
        
     // to find that the given value is  present or not
boolean contains = li.contains("java");
System.out.println(contains);

  List mi = new LinkedList();
  
  mi.add("sql");
  mi.add(100);
  mi.add(200);
  
  
  List ni = new Vector();
  
  ni.add(300);
  ni.add("sql");
  ni.add(400);
  
  
  // to remove the common value by comparing the two list 
  
  mi.removeAll(ni);
  System.out.println(mi);
  System.out.println(ni);
  
  mi.add("sql");
  
  // to retain the common value by comparing two list 
  
  ni.retainAll(mi);
  System.out.println(ni);
  System.out.println(mi);
  
  List x = new ArrayList();
  x.addAll(li);
  System.out.println(x);
  
  
  
         
	 
}
}
