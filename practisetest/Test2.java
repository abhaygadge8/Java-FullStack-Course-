/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
//use if instanceof 
package practisetest;
class Employee{
}
class Student{
}

class Test2{
	public static void main(String[] args){
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Object obj[]={e1,s1,e2,s2,e3,s3};
		Student std[]=new Student[3];
		Employee emp[]=new Employee[3];
		for(Object a:obj){
			if(a instanceof Student){
				for(int i=0;i<3;i++){
					std[i]=(Student)a;
				}
			}else{
				for(int i=0;i<3;i++){
					emp[i]=(Employee)a;
				}

			}
		}
		for(Student s:std){
			System.out.println(s);
		}
		for(Employee s:emp){
			System.out.println(s);
		}
	}
}