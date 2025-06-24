package com.vk.BinarySearchTree;

public class FirstLastPositionSortedArray {
	
	//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

    //If target is not found in the array, return [-1, -1]
	
	public static void main(String[] args) {
		int arr1 [] = {5,7,7,8,8,10};  //8
		int arr2 [] = {5,7,7,7,7,8,8,10};  // 4
		
		int res[] =  searchRange(arr2, 7);
		System.out.println("Range : "+res[0] + " "+res[1]);
	}
	
	public static int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int leftRange = -1;
        int rightRange = -1;
        int count =0;

        while(right>=left){
           int mid = (left+right)/2;
           
           if(nums[mid] == target){
               rightRange = mid;
               left = mid + 1;
               count++;
           }
           else if(nums[mid] < target){
             //rightRange = mid;
              left = mid + 1;
           }else
             right = mid -1;
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                leftRange = i;
                break;
            }
             
        }

        System.out.println("count "+count);
        int arr [] = {leftRange,rightRange};
        return arr;

    }

}
