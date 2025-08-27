/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.collectionapril25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Student implements Comparable<Student>{
	int roll;
	String name;
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	@Override
	public int compareTo(Student o) {
		if(this.roll>o.roll) {
			return 1;
		}else {
			return -1;
		}
	}
	public static void main(String[] args) {
		Student s1=new Student(1,"Abhay");
		Student s2=new Student(101,"Vicky");
		Student s3=new Student(15,"Abhi");
		Student s4=new Student(33,"Sakshi");
		List<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		Collections.sort(list);
		Iterator<Student> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}
	@Override
	public String toString() {
		return "Roll No : "+this.roll+" Name : "+this.name;
	}

}
