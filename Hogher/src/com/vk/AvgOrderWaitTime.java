package com.vk;

public class AvgOrderWaitTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] customers = {{5,2},{5,4},{10,3},{20,1}};
		
		double avgTime = new AvgOrderWaitTime().averageWaitingTime(customers);
		System.out.println("Avg out time "+avgTime);

	}
	
	public double averageWaitingTime(int[][] customers) {
        if(customers.length < 1)
          return 0.0;
        int order = customers[0][0] + customers[0][1];
        int timeTaken = order - customers[0][0];
        double total = timeTaken;
        for(int i=1;i<customers.length;i++){
        	if(customers[i][0] > order)
        		order = customers[i][0];
            order = order + customers[i][1];
            timeTaken = order - customers[i][0];
            total += timeTaken;
        }
        return total/customers.length;
    }

}
