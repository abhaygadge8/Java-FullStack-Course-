/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.collectionapril22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		//use of ArrayList
		ArrayList<Character> al=new ArrayList<Character>();
		al.add('a');
		al.add('B');
		al.add('D');
		al.add('E');
		al.add(2,'C');
		ArrayList<String> al2=new ArrayList<>();
		al2.add("Rocky");
		al2.add("Rani");
		//al.add(al2);
		//System.out.println(al.get(0)); 
		
		for(Object obj:al) {
			System.out.println(obj);
		}
		//use of LimkedList of List interface
		List ls=new LinkedList();
		ls.add("Abhi");
		ls.add(101);
		ls.add(false);
		ls.add('a');
		for(Object obj:ls) {
			System.out.println(obj);
		}
		//use of vector in list
		List<Character> ls1=new Vector<>();
		ls1.add('A');
		ls1.add('b');
		ls1.add('h');
		ls1.add('a');
		ls1.add('y');
		for(Object obj:ls1) {
			System.out.println(obj);
		}
		
		//use of stack class of list interface
		List<String> stack=new Stack<>();
		stack.add("Sakshi");
		stack.add("Naina");
		stack.add("pratiksha");
		stack.add("Shemdi");
		for(Object obj:stack) {
			System.out.println(obj);
		}
		
		//use of hasSet of set interface
		Set<Character> set=new HashSet<>();
		set.add('V');
		set.add('I');
		set.add('B');
		set.add('G');
		set.add('Y');
		set.add('O');
		set.add('R');
		for(Object obj:set) {
			System.out.println(obj);
		}
		
		//linkhashSet use of Set interface
		Set<String> set1=new LinkedHashSet<>();
		set1.add("IMCA-I");
		set1.add("IMCA-II");
		set1.add("IMCA-III");
		for(Object obj:set1) {
			System.out.println(obj);
		}

		
	}
}
