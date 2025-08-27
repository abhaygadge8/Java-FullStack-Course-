/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
// data hiding
package practisetest;
class Student{
	private int roll;
	private String name;
	private int marks;
	
	public void setRoll(int roll){
		// if(userIsValid() & isRollValid()){
			this.roll = roll;
		//}
	}
	public void setName(String name){
		this.name = name;
	}
	public void setMarks(int marks){
		// if(userIsValid() & isMarksValid()){
			this.marks = marks;
		//}
		
	}
	
	public int getRoll(){
		return this.roll;
	}
	public String getName(){
		return this.name;
	}
	public int getMarks(){
		return this.marks;
	}
	
}

public class Test6{
	public static void main(String args[]){
		System.out.println("Hello, World!");			
		Student s1 = new Student();
		s1.setRoll(1);
		s1.setName("Abhay");
		s1.setMarks(10);
		System.out.println("roll = "+s1.getRoll());
		System.out.println("name = "+s1.getName());		
		System.out.println("marks = "+s1.getMarks());			
	}
}