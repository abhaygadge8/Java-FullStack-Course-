/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.multitreading16april;

public class DemoMain {

	public DemoMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		Employee t1=new Employee();
//		Employee t2=new Employee();
//		Employee t3=new Employee();
//		t1.run();
//		t2.run();
//		t3.run();
		DemoThread t1=new DemoThread();
		t1.start();
		
//		for(int i=0;i<10;i++)
//			System.out.println("i am main thread"+i);
		}

}
