/**
 *  Assignment 2
 *  Author: Samuel Maness; 1213824311
 *  Description: 
 *  	This is the AddingMachine class. This has a constructor that will create an object 
 *  	that keeps track of various additions and subtractions, these attributes are shown below. 
 *  	There are 5 methods that make changes to to each object's attributes:
 *  	getTotal, add, subtract, toString, and clear, each of which are explained more later.
 *  	@param	total		This is an integer that keeps track of the numerical changes  
 *  	@param  operations	This is a String that keeps track of the operations done
 */

package cse360assign2;

public class AddingMachine {
	private int total;
	private String operations;
	
/**
 * 	This is the AddingMachine constructor
 * 	this sets the attributes of the integer total to 0, and the operations String to "0" 
 * 	as a default. 
 */
	public AddingMachine () {
		total = 0;  		
		operations = "0";	 
	}
	
/**
 * 	This is the getTotal method
 * @return total	this returns the integer value of total.
 */
	public int getTotal () {
		return total;	
	}
	
/**
 * 	This is the add method. This adds the value to the overall total 
 * 	and concatenated with a plus sign to the operations String.
 * @param value		This is the passed value that gets added to the total 
 * 					and concatenated to operations 
 */
	public void add (int value) {
		total += value;				
		operations += " + " + value;
	}
	
/**
 * 	This is the subtract method. This subtracts the value from the overall total
 * 	and concatenated with a minus sign to the operations String.
 * @param value		this is the passed value that gets subtracted to the total 
 * 					and concatenated to operations.
 */
	public void subtract (int value) {
		total -= value;
		operations += " - " + value;
	}
	
/**
 * 	This is the toString method. This returns all of the operations done so far.
 * @return 	The operations String with a new line at the end.
 */
	public String toString () {
		return operations + "\n";	
	}
	
/**
 * 	This is the clear method. This resets the integer total and the string operations
 *  back to 0 and "0" respectively.
 */
	public void clear() {
		total = 0;
		operations = "0";
	}
}
