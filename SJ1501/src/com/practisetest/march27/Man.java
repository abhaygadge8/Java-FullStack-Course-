/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.march27;


class Man implements Human{
	public void getBorn() {
		System.out.println("I am Born");
	}
	public static void main(String[] args) {
		Man m=new Man();
		m.getBorn();
		m.getDie();
		m.getReBorn();
	}
}