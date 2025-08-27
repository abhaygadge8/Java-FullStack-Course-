/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package mycollege;
import mypackage.Teacher;
private class Test{
	public static void main(String[] args){
		Student s1= new Student();
		Teacher t1 = new Teacher();
		s1.roll=1;
		s1.name="Abhay";
		t1.id=101;
		t1.name="omkar sir";
		System.out.println(s1.roll);
		System.out.println(s1.name);
		System.out.println(t1.id);
		System.out.println(t1.name);
		
	}
}