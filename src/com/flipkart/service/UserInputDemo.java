/**
 * 
 */
package com.flipkart.service;

import java.util.Scanner;

/**
 * @author ashwin.sudheer
 *
 */
public class UserInputDemo {

	/**
	 * @param args
	 */
	
	//We can take the user input using the scanner class with the help of scanner class we need to pass system.in parameter.
	// Inside the constructor of scanner class.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "Hello, input";  
        //Create scanner Object and pass string in it  
        Scanner scan = new Scanner(s);  
        //Check if the scanner has a token  
        System.out.println("Boolean Result: " + scan.hasNext());  
        //Print the string  
        System.out.println("String: " +scan.nextLine());  
        scan.close();           
        System.out.println("--------Enter Your Details-------- ");  
        Scanner in = new Scanner(System.in);  
        System.out.print("Enter your name: ");    
        String name = in.next();   
        System.out.println("Name: " + name);           
        System.out.print("Enter your age: ");  
        int i = in.nextInt();  
        System.out.println("Age: " + i);  
        System.out.print("Enter your salary: ");  
        double d = in.nextDouble();  
        System.out.println("Salary: " + d);         
        in.close();  
	}

}
