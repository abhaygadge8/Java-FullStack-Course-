/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.serilizatonDeselizatin15april;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserilizationMain {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		File file=new File("C:\\Java Symbosis\\Demo1.txt");
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		try {
			while(true) {
				Employee e=(Employee) ois.readObject();
				System.out.println(e);
			}
		}catch(EOFException e) {
			
		}
		finally {
			ois.close();
			fis.close();
		}
		
	}

}
