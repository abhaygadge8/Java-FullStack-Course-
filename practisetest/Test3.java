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

class Test3{
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
					obj[i]=a;
				}
			}
		}
		for(Object a:obj){
			if(a instanceof Employee){
				for(int i=3;i<6;i++){
					obj[i]=a;
				}
			}		
		}

		for(Object s:obj){
			System.out.println(s);
		}
	}
}