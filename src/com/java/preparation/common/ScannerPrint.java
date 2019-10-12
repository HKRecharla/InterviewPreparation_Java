package com.java.preparation.common;

import java.util.Scanner;

/**
 * @author Harikrishna Recharla
 *
 */

public class ScannerPrint {
	
	static Scanner scan = new Scanner(System.in);
	
	/**
	 * Fetching Integer value
	 * @return
	 */
	public static int scanInt() {
		return scan.nextInt();
	}

	/**
	 * Fetching String Value
	 * @return
	 */
	public static String scanString() {
		return scan.nextLine();
	}
	
	/**
	 * Fetching Double Value
	 * @return
	 */
	public static double scanDouble() {
		return scan.nextDouble();
	}
	
	
	/**
	 * Fetching Long Value
	 * @return
	 */
	public static long scanLong() {
		return scan.nextLong();
	}
	
	/**
	 * fetching Char Value
	 * @return
	 */
	public static char scanChar() {
		return scan.next().charAt(0);
	}
	
	
	
	
}
