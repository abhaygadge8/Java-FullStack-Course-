/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.april10;

public class Main1 {
	public static void main(String[] args) {
		int age=22;
		try {
			checkEligibility(age);
		}catch(NabalikException e) {
			System.out.println("you are undre age,do Study");
		}
	}
	static void checkEligibility(int age) throws NabalikException{
		if(age<21) {
			throw new NabalikException();
		}else {
			System.out.println("You can Marry");
		}
		
		
	}
	
}
