package com.vk;

import java.util.Arrays;
import java.util.Comparator;

public class BurstBallon2DArray {
	
	public static void main(String args[]){
		//int matrix[][] = { {10,16},{2,8},{1,6},{7,12} };
		int matrix[][] = { {1,2},{4,5},{1,5} };
		int col = 1; // sort by column 1 - endpoint of ballons
		sortbyColumn(matrix, col);
		int arrow =1;
		int end = matrix[0][1];
		for(int i=0;i<matrix.length;i++){
	        if(matrix[i][0] > end) {
	          arrow++;
	          end = matrix[i][1];
	        }
	          
	    }
		System.out.println("arrows "+arrow);

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}
	
	public static void sortbyColumn(int arr[][], int col){
	      Arrays.sort(arr, new Comparator<int[]>() {
	      	
	         @Override      	
	         public int compare(final int[] entry1, final int[] entry2) {
	            if (entry1[col] > entry2[col])
	               return 1;
	      	    else
	               return -1;
	         }
	      }); 
	   }

}
