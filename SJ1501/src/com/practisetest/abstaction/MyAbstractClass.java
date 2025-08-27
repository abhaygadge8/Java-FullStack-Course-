/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.abstaction;

public abstract class MyAbstractClass {
	int variable1;
	String variable2;
	MyAbstractClass(){
		variable1=18;
		variable2="Virat";
		System.out.println("this is MyAbstraction abstract class Constructor");
	}
	public abstract void myAbstractMethod1();
	public abstract void myAbstractMethod2();
	public static void myStaticMethod() {
		System.out.println("this is my Static method.");
	}
}
