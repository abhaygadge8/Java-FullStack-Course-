/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package practisetest;
class NonStaticMethod{
	public void display(){
		System.out.println("this is demo of non static  method");
	}
	public static void main(String[] args){
		NonStaticMethod s1=new NonStaticMethod();
		s1.display();
	}
}