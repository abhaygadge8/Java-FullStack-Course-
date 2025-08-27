/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.april11;
import java.io.File;
import java.io.IOException;
public class CreateOpeartion {
	public static void main(String[] args) {
		File file=new File("C:\\Java Symbosis\\NewDemo.java");
		try {
			if(file.createNewFile()) {
				System.out.println("your file is created!");
			}else {
				System.out.println("your file already Exists");
			}
			if(file.exists()) {
				System.out.println("File is exist");
			}else {
				System.out.println("file is not exist");
			}
			File newfile=new File(file.getParent());
			System.out.println("location of file is "+newfile.getAbsolutePath());
			System.out.println(file.getParent());
			String[] fileList=newfile.list();
			for(String name:fileList) {
				System.out.println(name);
				if(name.equalsIgnoreCase("NewDemo.java")) {
					File deletefile=new File(newfile.getAbsolutePath()+"\\"+name);
					System.out.println(deletefile.delete());
				}
			}
			System.out.println("After delete file list are");
			for(String name:fileList) {
				System.out.println(name);
			}
				
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}




/*public class CreateOpeartion {
	public static void main(String[] args) {
		File file=new File("C:\\Java Symbosis\\NewDemo.java");
		try {
			if(file.createNewFile()) {
				System.out.println("your file is created!");
			}else {
				System.out.println("your file already Exists");
				System.out.println(file.createNewFile());
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}*/
