/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.april10;
//Exception Handling Program of throws Keyword
public class Main {
	public static void main(String[] args) {
		System.out.println("Hello, Wolrd!");
		try {
			Class.forName("java.lang.String67");
		}catch(ClassNotFoundException e) {
			System.out.println("I am not found ClassNotFoundException");
		} 
		System.out.println("end");
	}
}


/*public class Main {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("Hello, Wolrd!");
		Class.forName("String");
		System.out.println("end");
	}

}*/


/*public class Main {
	public static void main(String[] args) {
		System.out.println("Hello, Wolrd!");
		Class.forName("Student");
		System.out.println("end");
	}

}*/
