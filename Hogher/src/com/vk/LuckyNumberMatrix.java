package com.vk;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumberMatrix {

	public static void main(String[] args) {
		int[][] matrix3 = { { 1,10,4,2},{9,3,8,7},{15,16,17,12}
				    };
		List<Integer> result = luckyNumbers(matrix3);
		for(Integer i : result)
			System.out.println("list of lucky no.s "+i);
	}
	
	public static List<Integer> luckyNumbers(int[][] matrix) {
        int min;
        //int max =-1;
        int row = 0;
        int y=0;
        List<Integer> ret = new ArrayList<>();
        while(row < matrix.length){
           min =  Integer.MAX_VALUE;
           y = -1;
           for(int c=0;c<matrix[row].length;c++){
              if(min > matrix[row][c]){
                min = matrix[row][c];
                y = c;
              }
           }
           boolean lucky = true;
           for(int i=0;i<matrix.length;i++){
        	   
             if(min < matrix[i][y]){
               lucky = false; 
               break;
             }
              
           }
           if(lucky)
        	   ret.add(min);
           row++;
        }
        
        return ret;

    }

}
