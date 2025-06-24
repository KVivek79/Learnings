package com.TwoPointers;

import java.util.Arrays;

// Given a sorted array A (sorted in ascending order), having N integers, find if there exists any pair of elements (A[i], A[j])
// such that their sum is equal to X
//2 Sum, 3 sum, Trapping rain water

public class TwoPointer {
	
	public static int[] twoSum(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
 
        while (left < right) {
            int sum = arr[left] + arr[right];
 
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
 
        return new int[]{-1, -1};
    }
 
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int target = 8;
        System.out.println("Indices: " + Arrays.toString(twoSum(arr, target)));
    }

}
