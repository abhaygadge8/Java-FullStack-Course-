/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
//use of Initilizer block of code
package practisetest;
class Parent{
	int money;
	Parent(){
		System.out.println("this is non-parameter constructor "+this.money);
	}
	{
		money=1000;
		System.out.println("Initializer value is "+this.money);
	}//Initilizer block of code
}
class Sample1{
	public static void main(String[] args){
		System.out.println("hello World!");
		Parent p1=new Parent();
		Parent p2=new Parent();
	}
}