/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.multithreading17april;

import com.practisetest.multitreading16april.Employee;
//using object of thread classs passing in constructor object of Runnable interface
public class Main {

	public static void main(String[] args) {
		Employee employee1=new Employee();
		employee1.setStr("My Deamon thread1");
		Thread t1=new Thread(employee1);
		t1.setDaemon(true);
		t1.start();
		
		Employee employee2=new Employee();
		employee2.setStr("My thread2");
		Thread t2=new Thread(employee2);
		t2.start();
		
		Employee employee3=new Employee();
		employee3.setStr("My thread3");
		Thread t3=new Thread(employee3);
		t3.start();
			

	}

}

//using getter and setter method
/*public class Main {

	public static void main(String[] args) {
		Employee employee=null;
		for(int i=0;i<5;i++) {
			employee=new Employee();
			employee.setStr("ThreadNumber "+(i+1));
			employee.run();
		}
			

	}

}*/
