/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package explicitconstructor;
class Student{
	int roll;
	String name;
	Student(){
		roll=0;
		name="Abhay";
	}
	Student(int roll,String name){
		this.roll=roll;
		this.name=name;
	}
	Student(int roll){
		this.roll=roll;
	}
}