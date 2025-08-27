/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.oops;
public class TestOops {

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setRoll(1);
		s1.getName().setFirstName("Abhay");
		s1.getName().setMiddleName("Vijayrao");
		s1.getName().setLastName("Gadge");
		Student s2=new Student();
		s2.setRoll(2);
		s2.getName().setFirstName("Kancha");
		s2.getName().setMiddleName(" ");
		s2.getName().setLastName("Chinna");
		
		System.out.println("roll "+s1.getRoll()+" Frist Name "+s1.getName().getFirstName());
		System.out.println("roll "+s2.getRoll()+" Frist Name "+s2.getName().getFirstName());

	}

}


/*public class TestOops {

	public static void main(String[] args) {
		FullName n1=new FullName();
		n1.setFirstName("Abhay");
		n1.setMiddleName("Vijayrao");
		n1.setLastName("Gadge");
		FullName n2=new FullName();
		n2.setFirstName("Kancha");
		n2.setMiddleName("");
		n2.setLastName("Chinna");
		Student s1=new Student();
		Student s2=new Student();
		s1.setName(n1);
		s1.setRoll(101);
		s2.setName(n2);
		s2.setRoll(102);
		System.out.println("roll "+s1.getRoll()+" Frist Name "+s1.getName().getFirstName());
		System.out.println("roll "+s2.getRoll()+" Frist Name "+s2.getName().getFirstName());

	}

}*/
