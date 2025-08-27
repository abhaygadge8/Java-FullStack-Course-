/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetestcomparatormay12;

import java.util.Comparator;

public class MarkWiseSort implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.marks>o2.marks) {
			return 1;
		}
		return 0;
	}

}
