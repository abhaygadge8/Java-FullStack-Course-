/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.serilizatonDeselizatin15april;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
// 
public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("Hello, Wolrd!");
		Student s1=new Student(1,"Abhay");
		Address add1=new Address(101,1,"shivagi nagar","Pune",411007);
		Address add2=new Address(111,1,"Dr B R Ambedkar Nagar","Warud",444906);
		FulltimeEmployee e1=new FulltimeEmployee("Abhay Gadge","java Developer",add1,50000);
		FulltimeEmployee e2=new FulltimeEmployee("Abhay V Gadge","software Developer",add2,60000);
		File file=new File("C:\\Java Symbosis\\Demo1.txt");
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.writeObject(e2);

		oos.close();
		fos.close();
	}
}











/*//Aggregation use in the serilizable 
public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("Hello, Wolrd!");
		Student s1=new Student(1,"Abhay");
		Address add1=new Address(101,1,"shivagi nagar","Pune",411007);
		Address add2=new Address(111,1,"Dr B R Ambedkar Nagar","Warud",444906);
		Employee e1=new Employee("Abhay Gadge","java Developer",add1);
		Employee e2=new Employee("Abhay V Gadge","software Developer",add2);
		File file=new File("C:\\Java Symbosis\\Demo1.txt");
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.writeObject(e2);

		oos.close();
		fos.close();
	
//		FileInputStream fis=new FileInputStream(file);
//		ObjectInputStream ois=new ObjectInputStream(fis);
//		try {
//			while(true) {
//				Employee e=(Employee) ois.readObject();
//				System.out.println(e);
//			}
//		}catch(EOFException e) {
//			
//		}
//		finally {
//			ois.close();
//			fis.close();
//		}	
//		Employee e=(Employee) ois.readObject();
//		Employee e3=(Employee) ois.readObject();
//		Employee e4=(Employee) ois.readObject();
		//ois.close();
		//fis.close();
//		System.out.println(e);
//		System.out.println(e3);
//		System.out.println(e4);	
	}
}*/
