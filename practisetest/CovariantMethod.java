/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package practisetest;

class CovariantMethod{
	int money;

	public CovariantMethod(int money) {
		this.money = money;
	}
	
}
public class Child extends CovariantMethod{
	Child(){
		System.out.println("I have "+this.money+" reppes");
	}
	int  display(){
		System.out.println("Hi");
		int i=10;
		return i;
	}

	public static void main(String[] args){
		Child c1=new Child();
		System.out.print(c1.display());
	}
}