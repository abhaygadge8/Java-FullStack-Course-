/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.april10;

public class Main2 {
	public static void main(String[] args) {
		Human h1=new Indian();
		Human h2=new Foreigner();
		try {
			Indian.isIndian(h1);
		}catch(ForeigerException e) {
			System.out.println("You are Foreigner");
		}
		try {
			Indian.isIndian(h2);
		}catch(ForeigerException e) {
			System.out.println("You are Foreigner");
		}

	}

}
