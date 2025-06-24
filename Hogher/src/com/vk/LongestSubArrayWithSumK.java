package com.vk;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {
	
	public static void main(String[] args) {
		int [] arr = {6,3,9,7,3};
		int [] arr1 = {2,3,5,1,9};
		int [] arr2 = {10, 5, 2, 7, 1, 9};
		int [] arr3 = {-1, 0, 1, 1, -1, -1, 0};
		
		int result = getLongestSubArrayWithSumK(arr2,15);
		System.out.println("getLongestSubArrayWithSumK "+result);
		
		int xres = getLongestSubArrayWithSumKwithNegative(arr3,0);
		System.out.println("getLongestSubArrayWithSumK Negative included "+xres);
	}

	private static int getLongestSubArrayWithSumK(int[] arr,int k) {
		// TODO Auto-generated method stub
		int i=0;
		int j =i+1;
		int sum =arr[i];
		int noOfSubarray = 0;
		while(i < arr.length-1 && j <= arr.length-1) {
			sum = sum+arr[j];
			if(sum == k) {
				if((j-i+1)> noOfSubarray)
				   noOfSubarray = j-i+1;
				j++;
			}else if(sum > k) {
				i++;
				j = i+1;
				sum=arr[i];
			}else {
				//sum = sum + arr[j];
				j++;
			}
			
		}			
		return noOfSubarray;
	}
	
	private static int getLongestSubArrayWithSumKwithNegative(int[] arr,int k) {
		int n = arr.length; // size of the array.

        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            //calculate the prefix sum till index i:
            sum += arr[i];

            // if the sum = k, update the maxLen:
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // calculate the sum of remaining part i.e. x-k:
            int rem = sum - k;

            //Calculate the length and update maxLen:
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            //Finally, update the map checking the conditions:
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
	}

}
