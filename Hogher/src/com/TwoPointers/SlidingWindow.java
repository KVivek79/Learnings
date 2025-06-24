package com.TwoPointers;

public class SlidingWindow {
	
	//To find the maximum sum of all subarrays of size K
	
	/*
	 * Max Sum of K-Size Subarray Smallest Subarray ≥ Target Longest Unique
	 * Substring Longest Subarray with Ones (K Flips) 101010101100011000 Check
	 * Permutation in String
	 */ 
	
	public static int maxSumSubarray(int[] nums, int k) {
		int maxSum = 0, windowSum = 0;
 
		for (int i = 0; i < k; i++) {
			windowSum += nums[i];
		}
		maxSum = windowSum;
 
		for (int i = k; i < nums.length; i++) {
			windowSum += nums[i] - nums[i - k];
			maxSum = Math.max(maxSum, windowSum);
		}
 
		return maxSum;
	}
 
	public static void main(String[] args) {
		int[] arr = {2, 1, 5, 1, 3, 2};
		int k = 3;
		System.out.println("Maximum sum of subarray of size " + k + ": " + maxSumSubarray(arr, k));
	}

}
