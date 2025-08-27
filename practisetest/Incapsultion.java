/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
// data hiding incapsulation
package practisetest;
class Employee{
	private int id;
	private String name;
	private long salary;
	private String designation;
	
	public void setId(int id){
		this.id = id;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setSalary(long salary){
		this.salary = salary;
	}

	public void setDesignation(String designation){
			this.designation = designation;	
	}
	
	public int getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public long getSalary(){
		return this.salary;
	}
	public String getDesignation(){
		return this.designation;
	}

	
}

public class Test7{
	public static void main(String args[]){			
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("Abhay");
		e1.setSalary(10000);
		e1.setDesignation("java developer");
		System.out.println("id = "+e1.getId());
		System.out.println("name = "+e1.getName());		
		System.out.println("Salary = "+e1.getSalary());
		System.out.println("Designation = "+e1.getDesignation());			
	}
}