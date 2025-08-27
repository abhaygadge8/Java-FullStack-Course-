/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.april21;

public class Demo {
	public static void main(String[] args) {
		String str="Abhay";
		System.out.println(str.hashCode());
		str="Gadge";
		System.out.println(str.hashCode());
		StringBuilder strb=new StringBuilder("Abhay");
		System.out.println(strb.hashCode());
		strb.replace(0,strb.length(),"Gadge");
		System.out.println(strb.hashCode());


	}
}
