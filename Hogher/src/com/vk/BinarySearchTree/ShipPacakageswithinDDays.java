package com.vk.BinarySearchTree;

public class ShipPacakageswithinDDays {

	//Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.

	public static void main(String[] args) {
		int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
		int weights2 [] = {3,2,2,4,1,4};
		int d = 3;
		int ans = leastWeightCapacity(weights2, d);
		System.out.println("The minimum capacity should be: " + ans);
	}


	public static int leastWeightCapacity(int[] weights, int d) {
		int low = Integer.MIN_VALUE, high = 0;
		for (int i = 0; i < weights.length; i++) {
			high += weights[i];
			low = Math.max(low, weights[i]);
		}

		while (low <= high) {
			int mid = (low + high) / 2;
			int numberOfDays = findDays(weights, mid);
			if (numberOfDays <= d) {
				//eliminate right half
				high = mid - 1;
			} else {
				//eliminate left half
				low = mid + 1;
			}
		}
		return low;
	}

	public static int findDays(int[] weights, int cap) {
		int days = 1; //First day.
		int load = 0;
		int n = weights.length;
		for (int i = 0; i < n; i++) {
			if (load + weights[i] > cap) {
				days += 1; //move to next day
				load = weights[i]; //load the weight.
			} else {
				//load the weight on the same day.
				load += weights[i];
			}
		}
		return days;
	}


}
