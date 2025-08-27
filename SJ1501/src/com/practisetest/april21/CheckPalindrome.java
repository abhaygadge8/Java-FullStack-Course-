/*Practical JavaFullStack Course 
 * Name: Abhay Vijayrao Gadge
 * Batch No:J150
*/
//check given string palindrome or not
package com.practisetest.april21;
public class CheckPalindrome {
	public boolean isPalindrome(StringBuffer str) {
		StringBuffer str1=str.reverse();
		if(str.equals(str1)) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		CheckPalindrome palindrome=new CheckPalindrome();
		StringBuffer str=new StringBuffer("abba");
		if(palindrome.isPalindrome(str)){
			System.out.println("your String is Palindrome");
		}else {
			System.out.println("your string is not palindrome");
		}
				
	}
}





/*public class CheckPalindrome {
	public boolean isPalindrome(String str) {
		//int left=0;
		//int right=str.length()-1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		CheckPalindrome palindrome=new CheckPalindrome();
		if(palindrome.isPalindrome("racecar")){
			System.out.println("your String is Palindrome");
		}else {
			System.out.println("your string is not palindrome");
		}
				
	}
}*/




/*public class CheckPalindrome {
	public boolean isPalindrome(String str) {
		int left=0;
		int right=str.length()-1;
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void main(String[] args) {
		CheckPalindrome palindrome=new CheckPalindrome();
		if(palindrome.isPalindrome("racecar")){
			System.out.println("your String is Palindrome");
		}else {
			System.out.println("your string is not palindrome");
		}
				
	}
}*/






/*public class CheckPalindrome {
	public boolean isPalindrome(String str) {
		String str1="";
		for(int i=str.length()-1;i>=0;i--) {
			str1+=str.charAt(i);
		}
		if(str1.equals(str)) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		CheckPalindrome palindrome=new CheckPalindrome();
		if(palindrome.isPalindrome("racecar")){
			System.out.println("your String is Palindrome");
		}else {
			System.out.println("your string is not palindrome");
		}
				
	}
}*/
