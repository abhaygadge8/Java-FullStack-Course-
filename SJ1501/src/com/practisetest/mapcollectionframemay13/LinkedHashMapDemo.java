/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.mapcollectionframemay13;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> ht=new LinkedHashMap<>();
		ht.put(1,"Abhay");
		ht.put(22,"Rakesh");
		ht.put(15,"Pratik");
		//use of SetKey() method
		System.out.println("use of SetKey method");
		Set<Integer> s=ht.keySet();
		Iterator<Integer> it=s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//use of Values() method 
		System.out.println("use of values method");
		Collection<String> c=ht.values();
		Iterator<String> it1=c.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		//use of get() method
		System.out.println("use of get method");
		for(Integer i:s) {
			System.out.println(i+" "+ht.get(i));
		}
		//use of entryset() method
		System.out.println("use of entrySet method");
		Set<Entry<Integer,String>> set=ht.entrySet();
		Iterator<Entry<Integer,String>> it2=set.iterator();
		while(it2.hasNext()) {
			Entry<Integer,String> e=it2.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
