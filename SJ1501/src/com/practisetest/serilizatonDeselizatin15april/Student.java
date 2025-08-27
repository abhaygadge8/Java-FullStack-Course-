/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.serilizatonDeselizatin15april;

import java.io.Serializable;


public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4L;
	transient int roll;
	String name;
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Name = "+this.name+" Roll No= "+this.roll;
	}
	
}





//old Serilizable program
//public class Student implements Serializable{
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 3L;
//	int roll;
//	String name;
//	public Student(int roll, String name) {
//		super();
//		this.roll = roll;
//		this.name = name;
//	}
//	@Override
//	public String toString() {
//		return "Name = "+this.name+" Roll No= "+this.roll;
//	}
//	
//}
