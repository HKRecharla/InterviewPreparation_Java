package com.java.preparation.strings;

import com.java.preparation.common.Convert;
import com.java.preparation.common.ScannerPrint;

/**
 * @author Harikrishna Recharla
 *
 */

public class LeftMove_RightMove {
	
	
	public static void main(String[] args) {
		String str = ScannerPrint.scanString();
		
		
		int len = str.length();
		int left =3;
		int right =2;
		
		
		String ref = "";
		String val = str.substring(left, len)+str.substring(0, left);
		System.out.println(val);
		
		String str1 = ScannerPrint.scanString();
		
		String rig = str1.substring(len-right,len)+str1.substring(0,len-right);
		System.out.println(rig);
	}

}
