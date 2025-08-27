package com.practisetest.practise5july;

public class Demo {

	public static void main(String[] args) {
		String str="Abhay";
		char[] ch=str.toCharArray();
		char temp;
		for(int i=0;i<ch.length/2;i++) {
			temp=ch[ch.length-1-i];
			ch[ch.length-1-i]=ch[i];
			ch[i]=temp;
		}
//		for(int i=str.length()-1;i>=0;i--) {
//			str1+=str.charAt(i);
//		}
//		StringBuilder str1=new StringBuilder(str);
//		str1.reverse();
		str=String.copyValueOf(ch);
		System.out.println(str);
		

	}

}
