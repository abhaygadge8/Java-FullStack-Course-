/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
//Demonstate the Map interface in Hashtable class and it's method
package com.practisetest.mapcollectionframemay13;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable<>();
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
		//use of Values() mathod 
		System.out.println("use of values method");
		Collection<String> c=ht.values();
		Iterator<String> it1=c.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		//use of get() mathod
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
