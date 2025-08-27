/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.serilizatonDeselizatin15april;

public class FulltimeEmployee extends Employee {
	int salary;
	public FulltimeEmployee(String name, String designation, Address address,int salary) {
		super(name, designation, address);
		this.salary=salary;
	}
	@Override
	public String toString() {
		return super.toString()+"\nsalary = "+this.salary;
	}
	
}
