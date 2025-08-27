/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
//program of comaprator and comparable
package com.practisetestcomparatormay12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Student s1=new Student(1,"Abhay",70);
		Student s2=new Student(13,"Pratik",99);
		Student s3=new Student(6,"Rutuja",80);
		Student s4=new Student(96,"Rakesh",98);
		Student s5=new Student(33,"Aditya",98);
		Student[] student= {s1,s2,s3,s4,s5};
		ArrayList<Student> al=new ArrayList<Student>(Arrays.asList(student));
		//Collections.sort(al);
		Collections.sort(al,new MarkWiseSort());
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}


	}

}
