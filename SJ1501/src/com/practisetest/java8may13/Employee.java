/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.java8may13;

public class Employee {
	int id;
	String name;
	int Salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
	}
}
