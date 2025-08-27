/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.april10;

public class Indian implements Human {
	int age;
	boolean voteregistationstatus;
	String name;
	public Indian() {
	}
	public Indian(int age, boolean voteregistationstatus, String name) {
		super();
		this.age = age;
		this.voteregistationstatus = voteregistationstatus;
		this.name = name;
	}
	static void isIndian(Human human) throws ForeigerException {
		if(!(human instanceof Indian)) {
			throw new ForeigerException();
		}else {
			System.out.println("you are Indian");
		}
	}
	

}
