/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.collectionapril23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;

public class DemoMain {

	public static void main(String[] args) {
		ArrayList<Character> al=new ArrayList<Character>();
		al.add('A');
		al.add('B');
		al.add('D');
		al.add('E');
		al.add(2,'C');
		System.out.println(al.contains('A'));
		
		//al.clear();
		//to create iterator of fail Safe iterator in CopyonWriteArrayList
		CopyOnWriteArrayList cp=new CopyOnWriteArrayList();
		cp.add("Abhay");
		cp.add("Rakesh");
		cp.add("Pratik");
		cp.add(null);
		cp.addAll(al);
		//containsAll method check the collection object present or not and give boolean value
		System.out.println(cp.containsAll(al));
		System.out.println(cp.retainAll(al));
		//iterator on CopyOnWriteArrayaList 
		Iterator it1=cp.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//stack create and operation stack done
		Stack<String> stack=new Stack<>();
		stack.push("Abhi");
		stack.push("Vicky");
		stack.push("Babu");
		stack.push("Amar");
		stack.push("Akshay");
		stack.push("Tanmay");
		System.out.println(stack.size());
		//use of toArray() method
		Object[] obje=stack.toArray();
		for(Object obj:obje) {
			System.out.println(obj);
		}
		//here iterator on stack used
		Iterator<String> it2=stack.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		//use of peek() method in stack
		System.out.println(stack.peek());
	}

}
