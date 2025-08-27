package com.practisetest.practise5july;

public class Outer {
	static int field;
	void outerMethod() {
		System.out.println("this is Outer Class");
		class Inner1{
			final int LOCAL_VARIABLE=99;
			void innerMethod1() {
				System.out.println(LOCAL_VARIABLE);
			}
		}
		Inner1 in1=new Inner1();
		in1.innerMethod1();
	}
	static class Inner{
		void innerMethodd() {
			System.out.println(field);
			System.out.println("this is inner Class");
			
		}
	}
	public static void main(String[] args) {
		Outer oc=new Outer();
		oc.outerMethod();
		oc.field=8;
		//Regular Inner class
		//Outer.Inner inner=oc.new Inner();
		//Static INNER CLASS
		Outer.Inner inner=new Outer.Inner();
		inner.innerMethodd();
	}

}
