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

class Test4{
	public static void main(String[] args){
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Object obj[]={e1,s1,e2,s2,e3,s3};
		Object nobj[]=new Object[obj.length];
		for(Object s:obj){
			System.out.println(s);
		}
		int left=0;
		int right=nobj.length;
		for(Object a:obj){
			if(a instanceof Student){
				for(left=0;left<right;left++){
					nobj[left]=a;
					left++;
					break;
				}
			}else{
				for(right=nobj.length-1;right>left;right--){
					nobj[right]=a;
					right--;
					break;
				}

			}
		}
		for(Object s:nobj){
			System.out.println(s);
			System.out.println((s instanceof Student));
			System.out.println((s instanceof Employee));

		}
	}
}