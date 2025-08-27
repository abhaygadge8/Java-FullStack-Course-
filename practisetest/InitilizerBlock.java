/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package practisetest;
class Human{
	Human(){
		System.out.println("I am Constructor");
	}
	{
		System.out.println("I am Initilizer");

	}
	static{
		System.out.println("I am static initilizer");

	}	
}
class Tests{
	
	public static void main(String[] args){
		Human H1=new Human();
		Human H2=new Human();
	}
}