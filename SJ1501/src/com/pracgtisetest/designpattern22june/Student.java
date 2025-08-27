//Singleton Design Pattrn
package com.pracgtisetest.designpattern22june;

class Student {
	public static Student student;
	private Student() {}
	public static Student getStudent() {
		if(student==null) {
			student=new Student();
		}
		return student;
	}
}


