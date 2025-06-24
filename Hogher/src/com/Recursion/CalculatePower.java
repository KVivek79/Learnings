package com.Recursion;

public class CalculatePower {
	
	public static int calcPower(int x, int n) {
		if(n ==0)
			return 1;
		if(x == 0)
			return 0;
		
		int retPower = calcPower(x, n-1);
		return x * retPower;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test = calcPower(5, 3);
        System.out.println(" calculated Power "+test);
	}

}
