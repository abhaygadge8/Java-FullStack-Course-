/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.java8may13;
//lambda Expression use
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Employeeproblem {

	public static void main(String[] args) {
		ArrayList<Employee> employee=new ArrayList<>(Arrays.asList(
				new Employee(1,"Abhay",500000),
				new Employee(22,"Rakesh",400000),
				new Employee(15,"Pratik",600000),
				new Employee(4,"Navnath",560000),
				new Employee(49,"Prafulla",5000000)));
		Comparator<Employee> com=new Comparator<>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return (e1.Salary<e2.Salary)?1:-1;
			}};
		employee.stream().sorted(com).map(t->t.name).map(String::toLowerCase).limit(1).forEach(System.out::println);;
	}

}
