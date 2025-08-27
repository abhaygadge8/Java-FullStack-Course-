/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.serilizatonDeselizatin15april;

import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4L;
	static int id=1001;
	String name;
	String designation;
	Address address;
	public Employee(String name, String designation,Address address) {
		this.name = name;
		this.designation = designation;
		this.address=address;
	}
	@Override
	public String toString() {
		String result="Emp id = "+Employee.id+"\nName = "+this.name+"\nDesignation = "+this.designation;
		result=result+"\nAddress = "+this.address.houseNO+"\t"+this.address.laneNO+"\t"+this.address.area+"\t"+this.address.city+"\t"+this.address.pinCode;
		return result;
	}
	

}





/*import java.io.Serializable;
//use of transient keyword in serializiable 
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	transient int id=1234;
	String name;
	String designation;
	public Employee(int id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Emp id = "+this.id+"\nName = "+this.name+"\nDesignation = "+this.designation;
	}
}*/


//Normal seriliziable program and Deserialization
/*public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	String designation;
	public Employee(int id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Emp id = "+this.id+"\nName = "+this.name+"\nDesignation = "+this.designation;
	}
}*/
