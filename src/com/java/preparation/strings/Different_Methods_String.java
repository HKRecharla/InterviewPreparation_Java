package com.java.preparation.strings;

/**
 * @author Harikrishna Recharla
 *
 */

public class Different_Methods_String {
	
	public static void main(String[] args) {
		
	}

	
	public static void s_length(String str) {
		int len = str.length();
		System.out.println("Length of String ==>"+len);
	}
	
	public static void s_SubString(String str,int i) {
		String s = str.substring(i);
		System.out.println("SubString of ::"+i+" ==>"+s);
	}
	
	
	public static void s_SubString_start_end(String str,int i,int j) {
		String s = str.substring(i, j);
		System.out.println("SubString of ::"+i+" "+j+" ==>"+s);
	}
	
	
}
