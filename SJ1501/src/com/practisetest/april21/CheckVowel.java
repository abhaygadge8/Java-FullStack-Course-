/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
//write a program to check if the vowels are present into string(if present print it).
package com.practisetest.april21;

public class CheckVowel {
	public void checkVowel(String str) {
		//String newstr = null;
		for(int i=0;i<str.length();i++ ) {
			if( str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||
				str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||
				str.charAt(i)=='O'||str.charAt(i)=='U') {
					System.out.print(str.charAt(i)+"\t");
			}
			
		}
	}
	public static void main(String[] args) {
		CheckVowel ch1=new CheckVowel();
		ch1.checkVowel("I Love My India");
	}
}






/*public class CheckVowel {
	public char checkVowel(String str) {
		for(int i=0;i<str.length();i++ ) {
			if( str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||
				str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||
				str.charAt(i)=='O'||str.charAt(i)=='U') {
					return str.charAt(i);
			}
			
		}
		return 'n';
	}
	public static void main(String[] args) {
		CheckVowel ch1=new CheckVowel();
		System.out.println(ch1.checkVowel("I Love My India"));
	}
}*/
