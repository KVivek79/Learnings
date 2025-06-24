package com.vk;

public class SecondSmallestNumber {
	
	public static void main(String[] args) {
		int [] arr = {6,3,9,7,3};
		
		int result = getSecondSmallestNumber(arr);
		System.out.println("Second smallest number "+result);
	}

	// Two pointer method
	private static int getSecondSmallestNumber(int[] arr) {
		int small = Integer.MAX_VALUE;
		int secondSmall = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i] < small) {
				secondSmall = small;
				small = arr[i];
			}else if(arr[i] < secondSmall && arr[i] != small)
				secondSmall = arr[i];
		}
		return secondSmall;
	}

}
