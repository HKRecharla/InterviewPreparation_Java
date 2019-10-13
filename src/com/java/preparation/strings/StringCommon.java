package com.java.preparation.strings;

import com.java.preparation.common.PrintConsole;

/**
 * @author Harikrishna Recharla
 *
 */

public class StringCommon {
	
	
	public static int getLength(String str) {
		int size = str.length();
		PrintConsole.sout("Length Of String ==> "+size);
		return size;
	}
	
	
	public static void getChar(String str) {
		int len = getLength(str);
		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			PrintConsole.sout(asString(ch));
		}
	}

	public static char getChar(String str,int i) {
		char ch = str.charAt(i);
		return ch;
	}
	
	public static String asString(char ch) {
		return String.valueOf(ch);
	}
	
	
}
