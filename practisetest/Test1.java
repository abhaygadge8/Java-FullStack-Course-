/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
//use if instanceof 
package practisetest;
class Employee{
	Employee(){
		System.out.println("I am Employee ");
	}
}
class TemporaryEmployee extends Employee{
	TemporaryEmployee(){
		System.out.println("I am Temporary Employee ");
	}
}
class PermnantEmployee extends Employee{
	PermnantEmployee(){
		System.out.println("I am Permnant Employee ");
	}
}

class Test1{
	public static void main(String[] args){
		Employee e1=new PermnantEmployee();
		System.out.println("this is e1 instance of Employee "+(e1 instanceof Employee));
		
	}
}