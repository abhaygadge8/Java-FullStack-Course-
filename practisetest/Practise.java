/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
//diff between Logical and Bitwise
package practisetest;

class Practise {
	public static void main(String[] args) {
		// Logical
		if (2 < 4 && 2 < 3) {
			System.out.println("&& Logical operator work");
		} else {
			System.out.println("&& Logical operator not work");

		}
		if (2 < 4 || 2 > 3) {
			System.out.println("|| Logical operator work");
		} else {
			System.out.println("|| Logical operator not work");

		}
		// Bitwise
		if (2 < 4 & 2 < 3) {
			System.out.println("& Bitwise operator work");
		} else {
			System.out.println("& Bitwise operator not work");

		}
		if (2 < 4 | 2 > 3) {
			System.out.println("| Bitwise operator work");
		} else {
			System.out.println("| Bitwise operator not work");

		}

	}
}