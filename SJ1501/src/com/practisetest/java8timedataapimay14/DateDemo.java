/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.java8timedataapimay14;

import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class DateDemo {

	public static void main(String[] args) {
		LocalDateTime localDate=LocalDateTime.now();
		System.out.println(localDate);
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy__HH-mm");
		localDate.format(dateTimeFormatter);
		System.out.println(localDate.format(dateTimeFormatter));
		//int year=localDate.getYear();
		//System.out.println(year);
		//Year y=Year.of(year);
		System.out.println(Year.of(localDate.getYear()-1).isLeap());

	}

}
