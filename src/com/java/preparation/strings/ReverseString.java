package com.java.preparation.strings;

import com.java.preparation.common.Convert;
import com.java.preparation.common.PrintConsole;
import com.java.preparation.common.ScannerPrint;

/**
 * @author Harikrishna Recharla
 *
 */

public class ReverseString {

	
	public static void main(String[] args) {
		String str = ScannerPrint.scanString();
		reverse_String_DefaultMethod(str);
		reverse_String_custom(str);
	}
	
	
	public static String reverse_String_DefaultMethod(String str) {
		StringBuffer sb = new StringBuffer(str);
		StringBuffer rsb = sb.reverse();
		PrintConsole.sout(rsb.toString());
		return rsb.toString();
	}
	
	public static void reverse_String_custom(String str) {
		int len = StringCommon.getLength(str);
		for (int i = len-1; i>0; i--) {
			char ch = StringCommon.getChar(str,i);
			Convert.char_to_String(ch);
		}	
	}
	
	
	
}
