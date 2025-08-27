/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
//Wrapper class and autoBoxing and unboxing Program
package com.practisetest.april8;
public class Helloworld {
	public static void main(String args[]) {
		int i=10;
		char ch='A';
		byte b=1;
		short s=10;
		boolean bool=true;
		long l=1234;
		Long objL=l;
		Boolean objBool=bool;
		Short objS=s;
		Byte objB=b;
		Character objch=ch;
		Integer objI=i;
		//Unboxing Proram here from
		int result=objI.intValue();
		System.out.println(result);
		char ch1=objch.charValue();
		System.out.println(ch1);
		byte b1=objB.byteValue();
		System.out.println(b1);
		short s1=objS.shortValue();
		System.out.println(s1);
		boolean bool1=objBool.booleanValue();
		System.out.println(bool1);
		long l1=objL.longValue();
		System.out.println(l1);
		
		
//		System.out.println(i);
//		System.out.println(objI);
//		System.out.println(ch);
//		System.out.println(objch);
//		System.out.println(b);
//		System.out.println(objB);
//		System.out.println(s);
//		System.out.println(objS);
//		System.out.println(bool);
//		System.out.println(objBool);
//		System.out.println(l);
//		System.out.println(objL);
	}

}

/*public class Helloworld {
	public static void main(String args[]) {
		int i=10;
		char ch='A';
		byte b=1;
		short s=10;
		boolean bool=true;
		long l=1234;
		@SuppressWarnings("removal")
		Long objL=new Long(l);
		@SuppressWarnings("removal")
		Boolean objBool=new Boolean(bool);
		@SuppressWarnings("removal")
		Short objS=new Short(s);
		Byte objB=new Byte(b);
		Character objch=new Character(ch);
		Integer objI=new Integer(i);
		
		System.out.println(i);
		System.out.println(objI);
		System.out.println(ch);
		System.out.println(objch);
		System.out.println(b);
		System.out.println(objB);
		System.out.println(s);
		System.out.println(objS);
		System.out.println(bool);
		System.out.println(objBool);
		System.out.println(l);
		System.out.println(objL);
	}

}*/

/*public class Helloworld {
	public static void main(String args[]) {
		StringBuffer sb=new StringBuffer("Abhay");
		System.out.println(sb);
		StringBuilder strbuild=new StringBuilder(" Gadge");
		sb=sb.append(strbuild);
		System.out.println(sb);
		sb.delete(2,5);
		System.out.println(sb);
		sb.deleteChatAt(2)
		System.out.println(sb);
	}

}*/

/*public class Helloworld {
	public static void main(String args[]) {
		String str1="Abhay";
		String str2=new String("abhay");
		System.out.println(str1.equalsIgnoreCase(str2));
	}

}*/
