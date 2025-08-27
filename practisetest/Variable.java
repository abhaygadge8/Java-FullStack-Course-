/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
//diff between static ,local,global
package practisetest;
class Practise2{
	static int a=5;
	int ab=10;
	static int sum(int a,int b){
		return a+b;
	}
	public static void main(String[] args){
		Practise2 abhi=new Practise2();
		System.out.println(a);
		System.out.println(abhi.ab);
		System.out.println(sum(5,6));
	}
}