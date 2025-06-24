package com.vk.BinarySearchTree;

public class SingleElementInSortedArray {
	
	//You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

    //Return the single element that appears only once.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1, 2, 3, 3, 4, 4}; // 0 1 2 4 5 6 7
		int [] arr1 = {2, 2, 3, 3, 4, 7, 7};

		System.out.println("SingleElementInSortedArray " +singleNonDuplicate(arr1));
	}
	
	public static int singleNonDuplicate(int[] nums) {
		int start =0;
		int end = nums.length -1;
		if(nums.length <= 1)
			return nums[0];
		while(end>=start){
			if(start == 0 && nums[start] != nums[start+1])
				return nums[start];
			if(end == nums.length-1 && nums[end] != nums[end-1])
				return nums[end];

			int mid = (start+end)/2;
			if(nums[mid] != nums[mid-1]  && nums[mid]!=nums[mid+1])
				return nums[mid];

			if(mid % 2 == 0){
				// For left side condition e.g 1 2 2 3 3
				if(nums[mid] == nums[mid - 1])
					end = mid - 1;
				else // For Right side condition e.g 1 1 2 2 3
					start = mid + 1;
			} 
			else{
				// For left side condition e.g 1 1 2 3 3 4
				if(nums[mid] == nums[mid + 1])
					end = mid - 1;
				else  // For Right side condition e.g 1 1 2 2 3 3
					start = mid + 1;
			}
		}
		return -1;
	}

}
