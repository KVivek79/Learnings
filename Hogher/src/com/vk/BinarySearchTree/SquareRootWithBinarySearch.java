package com.vk.BinarySearchTree;

public class SquareRootWithBinarySearch {

	//You are given a positive integer n. Your task is to find and return its square root. If ‘n’ is not a perfect square, then return the floor value of 'sqrt(n)'.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 9 12 -10
       System.out.println("SquareRootWithBinarySearch "+findSquareRoot(108));
       
       //alternate
       System.out.println(Math.sqrt(144));
	}
	
	public static int findSquareRoot(int n) {
		int left = 1;
		int right = n;
		int ans =0;
		while(right>=left) {
			int mid = (left + right )/2;
			if(mid * mid <= n) {
				ans = mid;
			    left = mid+1;
			}else //(mid * mid > n)
				right = mid-1;
			
				
		}
		return ans;
	}

}
