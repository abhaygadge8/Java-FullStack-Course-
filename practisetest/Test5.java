/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
//use if instanceof 
package practisetest;
class Student{
	public Student(){}
}

class Employee{
	public Employee(){}
}


public class Test5{
	public static void main(String[] args){
		Student s1 = new Student(); 
		Student s2 = new Student();
		Student s3 = new Student();
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();

		Object[] obj = {s1, e1, e2, s2, s3, e3};
		int i=0, p=obj.length-1;
		//Object pivot = obj[p].getClass();
		Class<?> pivot = obj[p].getClass();
		for(int j=0; j<obj.length-1; j++){
			
			if(pivot.isInstance(obj[j])){
				;
			}
			else{
				Object temp = obj[j];
				obj[j] = obj[i];
				obj[i] = temp;
				i++;

			}

		}

		for(Object o: obj){
		System.out.println(o);
		}
	}
}