
/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package practisetest;

class Practise3 {
	String name;
	String roll;

	public Practise3() {
	}

	Practise3(String name, String roll) {
		this.name = name;
		this.roll = roll;
	}

	public static void main(String[] args) {
		Practise3 a = new Practise3("Abhay", "1");
		System.out.println(a.name + " and " + a.roll);
	}
}