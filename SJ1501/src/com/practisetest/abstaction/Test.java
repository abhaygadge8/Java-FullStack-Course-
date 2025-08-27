/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.abstaction;

public class Test {

	public static void main(String[] args) {
		//System.out.println("");
		MyGradChild obj=new MyGradChild();
		obj.myAbstractMethod1();
		obj.myAbstractMethod2();
		MyAbstractClass.myStaticMethod();
		//obj.variable1=1;
		//obj.variable2="Abhay";
		System.out.println(obj.variable1+" "+obj.variable2);
	}

}
