package com.vk.BinarySearchTree;

public class SearchInsertPosition {

	//You are given a sorted array arr of distinct values and a target value x. You need to search for the index of the target value in the array.

    //If the value is present in the array, then return its index. Otherwise, determine the index where it would be inserted in the array while maintaining the sorted order.
	
	public static void main(String[] args) {
		int arr [] = {1,2,4,10,32,36};
		int x = 30;
		
		int ans = searchInsertPosition(arr,x);
		System.out.println("value or insert position "+ans);
		
	}

	private static int searchInsertPosition(int[] arr, int x) {
		int left = 0;
		int right = arr.length-1;
		int ret = 0;
		
		while(right >= left) {
			int mid = (left + right)/2;
			
			if(arr[mid] >= x) {
				ret = mid;
				right = mid -1;
			}else {
				left = mid + 1;
			}
		}
		return ret;
	}
	
}
