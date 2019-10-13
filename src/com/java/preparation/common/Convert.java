package com.java.preparation.common;

/**
 * @author Harikrishna Recharla
 *
 */

public class Convert extends PrintConsole {


	public static int string_to_Integer(String str) {int val = Integer.parseInt(str);
		soutp(val);
		return val;
	}

	public static String int_to_String(int i) {String s = String.valueOf(i);
		soutp(s);
		return s;
	}

	public static String doubel_to_String(double d) {String s = String.valueOf(d);
		soutp(s);
		return s;
	}

	public static String long_to_String(long d) {String s = String.valueOf(d);
		soutp(s);
		return s;
	}
	
	public static String char_to_String(char d) {String s = String.valueOf(d);
		soutp(s);
		return s;
	}
	
	public static float string_to_Float(String str) {float f = Float.parseFloat(str);
		soutp(f);
		return f;
	}
	
	
	public static double string_to_Double(String str) {double d = Double.parseDouble(str);
		soutp(d);
		return d;
	}
	
	static boolean flag;
	public static boolean isDigit(char ch) {
		
		flag = Character.isDigit(ch);
		if(flag == true) {
			return flag;
		}else {
			return false;
		}
	}
	
	public static boolean isAlpha(char ch) {
		flag = Character.isAlphabetic(ch);
		if(flag ==true) {
			return flag;
		}else {
			return false;
		}
	}
	
	

}
