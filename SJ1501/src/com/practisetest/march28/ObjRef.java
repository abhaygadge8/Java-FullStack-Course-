/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
//Object class method

package com.practisetest.march28;
class Parent{}
class Child extends Parent{}
public class ObjRef {

	public static void main(String[] args) {
		Object c1=new Child();
		Object c2=new Child();
		System.out.println("Hello, world!");
		System.out.println(c1.equals(c1));
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());


	}

}
