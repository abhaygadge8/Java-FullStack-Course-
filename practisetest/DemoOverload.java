/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package practisetest;
class DemoOverload{
	void display(){
		System.out.println("this is first method");
	}
	void display(int roll){
		System.out.println("my Roll number is "+ roll);
	}
	void display(double roll){
		System.out.println("my old Roll number is "+ roll);
	}
	void display(int roll,String name){
		System.out.println("my Roll number is "+ roll);
		System.out.println("my name is "+ name);
	}
	public static void main(String[] args){
		DemoOverload d1=new DemoOverload();
		d1.display();
		d1.display(1);
		d1.display(2.3);
		d1.display(1,"Abhay");
	}
}