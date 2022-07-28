/**
 * 
 */
package com.flipkart.bean;

import com.flipkart.service.CustomerService;

/**
 * @author ashwin.sudheer
 *
 */
public class CustomerApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerService service = new CustomerService();
		service.createCustomer();
		service.deleteCustomer();
		service.updateCustomer();
		service.viewCustomer();
	}

}
