/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
//use of final keyword
package practisetest;
class Parent{
	int money=100;
	void showmoney(){
		System.out.println("I have money "+this.money);
	}
}
class Child extends Parent{
	money=10;
	void showmoney(){
		System.out.println("my total worth is "+this.money);
	}
}
class Sample{
	public static void main(String[] args){
		Parent c1=new Child();
		System.out.println(c1.money);
		c1.showmoney();
	}
}