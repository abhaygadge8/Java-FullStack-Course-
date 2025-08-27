/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.april11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class FileOperation {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Java Symbosis\\BinarySearch.java");
		Scanner scanner=new Scanner(file);
		while(scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		scanner.close();
	}
}



/*public class FileOperation {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Java Symbosis\\NewDemo.txt");
		try {
			FileWriter filewrite = new FileWriter(file);
			//System.out.println(file.createNewFile());
			String message="I love my India";
			filewrite.write(message);
			String message2="sare jahase accha hindustan hamara";
			filewrite.append(message2);
			filewrite.close();	
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}
}*/
