/**
 * 
 */
package com.flipkart.service;

/**
 * @author ashwin.sudheer
 *
 */
public class Calculator extends DemoClassAbstract{
	
	// Define all the calculator methods.
	public int add(int a, int b) {
		return a+b;
	}
	
	public int subtract(int a, int b) {
		return a-b;
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}
	
	public int divide(int a, int b) {
		return a/b;
	}

	@Override
	public String testAbstractNonImpl() {
		// TODO Auto-generated method stub
		return "This method is implemented in Cal class";
	}
	
}
