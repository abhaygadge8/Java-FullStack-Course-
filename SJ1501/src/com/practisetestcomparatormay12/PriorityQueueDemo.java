/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetestcomparatormay12;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		//PriorityQueue 
		PriorityQueue pq=new PriorityQueue();
		pq.offer("Abhay");
		pq.offer("vicky");
		System.out.println(pq.peek());
		Iterator it=pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Deque interface
		ArrayDeque<Object> aq=new ArrayDeque<>();
		aq.add(1);
		aq.add('a');
		aq.add("Raajan");
		aq.add(true);
		it=aq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
