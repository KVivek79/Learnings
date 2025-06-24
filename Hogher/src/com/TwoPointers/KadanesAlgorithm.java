package com.TwoPointers;

public class KadanesAlgorithm {
	
	//Given an array arr[], the task is to find the subarray that has the maximum sum and return its sum.
	
	/*
	 * Maximum Sum Subarray 
	 * Maximum Circular Sum 
	 * Max Non-Adjacent Sum 
	 * Maximum Product Subarray
	 * Longest Subarray Sum K
	 */
	
	public static int maxSubarraySum(int[] nums) {
        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];
 
        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
 
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum subarray sum: " + maxSubarraySum(arr));
    }

}
