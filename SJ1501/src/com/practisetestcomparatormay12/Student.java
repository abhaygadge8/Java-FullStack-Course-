/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetestcomparatormay12;

public class Student implements Comparable<Student>{
	@Override
	public String toString() {
		return "Student roll=" + roll + ", name=" + name + ", marks=" + marks ;
	}
	int roll;
	String name;
	int marks;
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public int compareTo(Student o) {
		if(this.marks>o.marks)
			return 1;
		else
			return -1;
	}
	
}
