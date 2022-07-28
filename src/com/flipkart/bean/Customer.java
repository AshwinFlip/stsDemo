/**
 * 
 */
package com.flipkart.bean;

/**
 * @author ashwin.sudheer
 *
 */
public class Customer {

	//This is in a bean class which contains the properties and respective setter-getters.
	
	private int customerID; 
	private int customerName;
	private int customerAddress;
	/**
	 * @return the customerID
	 */
	public int getCustomerID() {
		return customerID;
	}
	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	/**
	 * @return the customerName
	 */
	public int getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(int customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return the customerAddress
	 */
	public int getCustomerAddress() {
		return customerAddress;
	}
	/**
	 * @param customerAddress the customerAddress to set
	 */
	public void setCustomerAddress(int customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	
	
}
