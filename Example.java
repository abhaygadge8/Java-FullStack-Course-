/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package practisetest;
class Example{
	int s;
	Example(){
		System.out.println("this is Example().");
	}
	Example(int s){
		this();
		this.s=s;
		System.out.println("this is Example(int s)");
	}
	public static void main(String[] args){
		Example e1= new Example(3);
	}	
}