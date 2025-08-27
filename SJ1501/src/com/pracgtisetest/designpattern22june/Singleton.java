//Singleton Design Pattrn
package com.pracgtisetest.designpattern22june;

public class Singleton {

	public static void main(String[] args) {
		Student s1=Student.getStudent();
		Student s2=Student.getStudent();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
