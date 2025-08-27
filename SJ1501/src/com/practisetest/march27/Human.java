/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.march27;

public interface Human {
	void getBorn();
	default void getDie() {
		System.out.println("I am die");
		getSalvation();
		getSalvation1();
	}
	default void getReBorn() {
		System.out.println("I am Back");
	}
	private void getSalvation() {
		System.out.println("I am Mokshya");
	}
	private void getSalvation1() {
		System.out.println("I am at Mokshya now");
	}
}
