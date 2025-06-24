package com.vk;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums1 = {1,2,3,0,0,0}; int m = 3; int [] nums2 = {2,8,9}; int n = 3;
		int [] ret = mergeSort(nums1, m, nums2, n);
		for(int i=0;i<ret.length;i++)
		System.out.println(ret[i]);
	}
	
	public static int[] mergeSort(int[] nums1, int m, int[] nums2, int n) {
		int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k--]=nums1[i--];
            }
            else{
                nums1[k--]=nums2[j--];
            }
        }
        while(j>=0){
            nums1[k--]=nums2[j--];
        }
		return nums1;
	}

}
