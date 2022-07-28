/**
 * 
 */
package com.flipkart.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



/**
 * @author ashwin.sudheer
 *
 */
public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create
		List<String> al = new ArrayList<String>();
		System.out.println("Size of the collection"+al.size());
		al.add("Delhi");
		al.add("Bangalore");
		al.add("Pune");
		al.add("Kochi");
		System.out.println("Size of the collection"+al.size());
		System.out.println("Detail of the collection"+al);
		//Deletion - We can delete the collection by name or index value
		al.remove("Kochi");
		al.remove(0);
		System.out.println("Size of the collection"+al.size());
		System.out.println("Detail of the collection"+al);
		
		//List of Collections
		// Iterate the collection or list uisng for in ways 
		
		 // Iterable interface 
     
		// Iterator is interface which is using to iterate the Collection
		Iterator<String> i=al.iterator();
		while(i.hasNext()){
   	  
			String test=i.next();
			System.out.println("detals of Capital------>" +test);
		}
	
     

     // Another way to iterate the collection using for loop 
     
  // Loop through elements.
        for (String value : al) {
    	    
    	    System.out.println("Element: " + value);
    	}
	}

}
