//Factory Design Pattern Program
package com.pracgtisetest.designpattern22june;

public class CarFactory implements Car{
	public Car getInstatance(String name) {
		if(name.equalsIgnoreCase("NANO")) {
			return new Nano();
		}else if(name.equalsIgnoreCase("Safari")){
			return new Safari();
		}else if(name.equalsIgnoreCase("Harrier")) {
			return new Harrier();
		}
		return null;
	}
	public static void main(String[] args) {
		CarFactory cf=new CarFactory();
		Nano n1=(Nano)cf.getInstatance("Nano");
		System.out.println(n1.hashCode() );
		Safari s1=(Safari) cf.getInstatance("Safari");
		System.out.println(s1.hashCode() );
		Harrier h1=(Harrier) cf.getInstatance("Harrier");
		System.out.println(h1.hashCode() );

	}

}
