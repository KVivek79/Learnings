package com.vk.BinarySearchTree;

public class SearchInRotatedSortedArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {4,5,6,7,0,1,2};

		System.out.println("SearchInRotatedSortedArray " +search(arr,0));
	}
	
	
	public static int search(int[] nums, int target) {
        int right = nums.length - 1;
        int left = 0;
        while(right>=left){
            int mid = (left + right)/2;
             if(nums[mid] == target)
               return mid;
             else if(nums[left] <= nums[mid]){  // left part is sorted
                if (nums[left] <= target && target <= nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
             }else {  // right part is sorted
                if (nums[right] >= target && target >= nums[mid]) {
                    left = mid + 1;
                }
                else
                  right = mid - 1;
             }
        }
        return -1;
    }

}
