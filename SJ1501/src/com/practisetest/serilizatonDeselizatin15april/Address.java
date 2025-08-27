/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
package com.practisetest.serilizatonDeselizatin15april;

import java.io.Serializable;

public class Address implements Serializable{
	int houseNO;
	int laneNO;
	String area;
	String city;
	int pinCode;
	public Address(int houseNO, int laneNO, String area, String city, int pinCode) {
		super();
		this.houseNO = houseNO;
		this.laneNO = laneNO;
		this.area = area;
		this.city = city;
		this.pinCode = pinCode;
	}
}
