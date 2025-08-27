/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
//demo of set interface in class HashSet,LinkedHashSet and TreeSet
package com.practisetestcomparatormay12;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		//HashSet
		HashSet s=new HashSet();
		s.add("Abhay");
		//LinkedHashSet
		LinkedHashSet< String> ls=new LinkedHashSet<String>();
		ls.addAll(s);
		//TreeSet
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Vicky");
		
		
	}

}
