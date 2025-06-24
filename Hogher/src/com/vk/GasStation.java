package com.vk;

public class GasStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int [] gas = {3,1,1};
	int [] cost = {1,2,2};
	
	System.out.println("Index if it completes a cycle " +canCompleteCircuit(gas,cost));
	}
	
	public static int canCompleteCircuit(int[] gas, int[] cost) {
        int index = 0;
        int tank = 0;
        int total =0;
        for(int i=0;i<gas.length;i++){
            tank +=  gas[i]- cost[i];
            if(tank < 0){
                total+=tank;
                tank=0;
                index=i+1;
            }    
            //total += tank;
        }
        total += tank;
        return total>=0?index:-1;
    }

}
