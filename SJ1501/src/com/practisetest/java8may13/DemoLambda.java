
/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/package com.practisetest.java8may13;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoLambda {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		al.stream().forEach(n->System.out.print(n));
		al.stream().forEach(System.out::println);

	}
}
