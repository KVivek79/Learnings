package com.vk;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,Integer> map = new HashMap<>();
		// Dynamic programming - 0,1,1,2,3,5..... - fibonaaci series
		System.out.println(process(5, map));


	}

	static int process(int n, Map<Integer,Integer> map){
		if(n<=1) {
			//map.put(n, n);
			return n;
		}
			


		if(map.get(n) != null)
			return map.get(n);
	    map.put(n, process(n-1,map) + process(n-2, map));

		return map.get(n);

	}

}
