/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.collectionapril25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class NewDemo {

	public static void main(String[] args) {
		Set<Character> set=new LinkedHashSet<Character>();
		set.add('A');
		set.add('B');
		set.add('H');
		set.add('A');
		set.add('Y');
		Iterator<Character> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		List<Character> list=new ArrayList<Character>(set);
		Collections.sort(list);
		Iterator<Character> it1=list.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		Collections.sort(list,Collections.reverseOrder());
		Iterator<Character> it2=list.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		
	}

}
