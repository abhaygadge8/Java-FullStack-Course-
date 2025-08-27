package com.practisetest.practise5july;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class StringOperation {

	public static void main(String[] args) {
		String[] str= {"Apple","Banana","Cherry","Dates","Apple","Dates"};
		HashSet<String> hs=new HashSet();
		HashSet<String> newSet=new HashSet<String>();
		for(int i=0;i<str.length;i++) {
			if(!(hs.add(str[i]))) {
				newSet.add(str[i]);
			}
		}
		System.out.println(newSet);
		
		

	}

}
