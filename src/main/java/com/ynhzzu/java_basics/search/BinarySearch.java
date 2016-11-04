package com.ynhzzu.java_basics.search;

public class BinarySearch {
	
	public int search(int[] vals, int a) {
		if(null != vals) {
			int low = 0;
			int high = vals.length - 1;
			while(low <= high) {
				int middle = (high + low) / 2;
				System.err.println(middle);
				if(vals[middle] < a) {
					low = middle + 1;
				} else if(vals[middle] > a) {
					high = middle - 1;
				} else {
					return middle;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] a = new int[]{10, 59, 67, 90, 167, 345, 891};
		BinarySearch search = new BinarySearch();
		System.out.println(search.search(a, 10));
	}

}
