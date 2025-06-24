package com.vk.BinarySearchTree;

public class MinimumInRotatedSortedArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {4,5,6,7,0,1,2}; // 0 1 2 4 5 6 7
		int [] arr1 = {2,1,0,3};

		System.out.println("MinimumInRotatedSortedArray " +search(arr));
	}
	
	
	public static int search(int[] nums) {
        int right = nums.length - 1;
        int left = 0;
        int min = Integer.MAX_VALUE;
        int noOfRotation=0;
        while(right>=left){
            int mid = (left + right)/2;
            min =Math.min(min, nums[mid]);
            if(nums[left] <= nums[mid]){  // left part is sorted
               if(min > nums[left]) {
            	   min = nums[left];
            	   noOfRotation = left;
               }                
               left = mid +1;
            }else {  // right part is sorted
            	if(min > nums[mid]) {
            		min = nums[mid];
            		noOfRotation = mid;
            	}
               
               right = mid - 1;
            }
        }
        System.out.println("No Of Array Rotation "+noOfRotation);
        return min;
    }

}
