package com.revature.tier1;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {
		
		int sum = 28;
		
		if(arr == null) {
			return 0;
		}
		
		for(int i = 2; i < arr.length; i++) {
			sum = sum + 5;
		}
			
		return sum;
	}
}
