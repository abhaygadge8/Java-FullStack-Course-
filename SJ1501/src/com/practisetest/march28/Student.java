/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
//Object class method Demo
package com.practisetest.march28;

public class Student {
	int roll;
	String name;
	
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	public String toString() {
		return "Roll No = "+this.roll+" Name = "+this.name;
	}
	

	public static void main(String[] args) {
		Student s1=new Student(1,"Abhay");
		Student s2=new Student(2,"Pratik");
		System.out.println(s1.toString());
		System.out.println(s2);

	}

}
