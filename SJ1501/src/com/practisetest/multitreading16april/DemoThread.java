/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.multitreading16april;

public class DemoThread extends Thread {

	@Override
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println("I am Running..."+i);
	}
	
}
