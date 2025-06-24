package com.vk;

public class RemoveElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {0,1,2,2,3,0,4,2}; int val = 2;
		removeElement(nums, val);
		for(int i=0;i<nums.length ;i++)
          System.out.println(nums[i]);
	}
	
	public static void removeElement(int[] nums, int val) {
        int i=0; int j=nums.length -1; 	
        int b =0;
        while(i < j){
            if(nums[i] == val){
            	b++;
                swap (i,j,nums);
                while(nums[i]==nums[j]){
                	b++;
                   swap (i,j-1,nums);
                   i++; j--;
                }
                i++; j--;
            }
           i++;  
        } 
        System.out.println("count "+b);
    }

    static void swap (int i,int j, int nums []){ // 0 3
       nums[i] = nums[i]+nums[j];
       nums[j] = nums[i]-nums[j];
       nums[i] = nums[i]-nums[j];
    }

}
