package com.ynhzzu.java_basics.utils;

public class PrintUtil {
	
	public static void printArray(int[] vals) {
		if(null != vals) {
			for (int i = 0; i < vals.length; i++) {
				System.out.print(vals[i] + "\t");
			}
			System.out.println();
		}
	}

}
