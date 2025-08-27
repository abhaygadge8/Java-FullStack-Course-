/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.java8may13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;

public class ComsumerDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		/*Comparator<Integer> com=new Comparator<Integer>() {
			
			@Override
			public int compare(Integer n1, Integer n2) {
				return (n1<n2)?1:-1;
			}
		};*/
		/*Function<Integer,Integer> fun=new Function<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t*10;
			}
		};*/
		/*Predicate<Integer> p=new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				return t%2==0;
			}
			
		};*/
		al.stream().sorted((n1,n2)->(n1<n2?1:-1)).filter(t->t%2==0).map(t->t*t).limit(3).skip(2).forEach(t-> System.out.println(t));
		System.out.println(al.stream().count());
	}

}
