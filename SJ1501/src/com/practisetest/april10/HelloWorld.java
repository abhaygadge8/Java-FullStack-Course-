/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.april10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.practisetest.serilizatonDeselizatin15april.Student;
public class HelloWorld {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello, Wolrd!");
		File file=new File("C:\\Java Symbosis\\Demo2.txt");
		Student s1=new Student(1,"Abhay");
		try(FileOutputStream fos=new FileOutputStream(file);
			ObjectOutputStream oos=new ObjectOutputStream(fos)) {
			oos.writeObject(s1);
		}catch(FileNotFoundException | ArithmeticException |NumberFormatException e){
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}



/*public class HelloWorld {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello, Wolrd!");
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			Student s1=new Student(1,"Abhay");
			File file=new File("C:\\Java Symbosis\\Demo1.txt");
			fos=new FileOutputStream(file);
			oos=new ObjectOutputStream(fos);
			oos.writeObject(s1);
		}catch(FileNotFoundException | ArithmeticException |NumberFormatException e){
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			oos.close();
			fos.close();
		}
		
	}
}*/
