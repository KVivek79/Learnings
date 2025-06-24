package com.vk;

import java.util.ArrayList;
import java.util.List;

public class Feat {
	
	    public List<Integer> luckyNumbers (int[][] matrix) {
	        

	        //1. find min of a row
	        //2. check if it is max of its col

	        int m = matrix.length;

	        List<Integer> res = new ArrayList<>();

	        for(int i=0 ; i<m ; i++){

	            //find min element in a row
	            int minval = findMin(i,matrix);

	            //store it in a cell
	            int store = matrix[i][minval];

	            //check if this cell is also max of the column
	            if(isMax(minval,store,matrix)){
	                res.add(store);
	            }

	        }
	        return res;  
	        
	    }

	    private int findMin(int row,int[][] matrix ){

	        //store the min val at first
	        int minval = matrix[row][0];
	        int mincol = 0;

	        for(int i=1; i<matrix[row].length; i++){
	            if(matrix[row][i] < minval){
	                minval = matrix[row][i];
	                mincol = i;
	            }
	        }
	        return mincol;
	    }

	    private boolean isMax(int col,int stored,int[][] matrix ){

	        for(int i=0; i<matrix.length; i++){
	            
	            if(matrix[i][col] > stored){
	                return false;    
	            }
	        }
	        return true;
	    }

}
