/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package practisetest;
class Student{
	
	{
		roll=1;
		System.out.println("b1");
	}
	{
		name="Abhay";
		System.out.println("b2");
	}
	static{
		PASS_OUT_YEAR=2025;
		System.out.println("b3");
	}
	int roll;
	String name;
	final static int PASS_OUT_YEAR;
	Student(){}
	Student(int roll,String name){
		this.roll=roll;
		this.name=name;
	}
	
}
public class Test{
	
	public static void main(String[] args){
		Student s1=new Student();
		System.out.println(s1.roll+" and "+s1.name+" "+Student.PASS_OUT_YEAR);
		//System.out.println(s2.roll+" and "+s2.name);
	}
}