/**
 * 
 */
package com.flipkart.demo;

import com.flipkart.service.A;
import com.flipkart.service.D;
import com.flipkart.service.Calculator;

/**
 * @author ashwin.sudheer
 *
 */
public class CalculatorApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create instance of the class
//		Calculator calculator = new Calculator();
//		System.out.println(calculator.add(10, 10));
//		System.out.println(calculator.subtract(10, 10));
//		System.out.println(calculator.multiply(10, 10));
//		System.out.println(calculator.divide(10, 10));
//		System.out.println(calculator.testAbstractImpl());
//		System.out.println(calculator.testAbstractImpl());
		
		A obj = new A();
		D obj2 = new D();
		System.out.println(obj.functionA());
		System.out.println(obj.functionB());
		System.out.println(obj.functionC());
		System.out.println(obj2.functionD());
	}

}
