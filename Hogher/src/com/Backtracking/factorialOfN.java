package com.Backtracking;

public class factorialOfN {
	
	public static void arrangements(String inputStr, String retChar) {
		//String ret = "";
		if(inputStr.length()==0) {
			System.out.println(" combinations : "+retChar);
			return;
		}
		
		for(int i=0;i<inputStr.length();i++) {
			char fixedChar = inputStr.charAt(i); //a -> b -> c
			String newChar = retChar + fixedChar; //a -> ab -> abc
			String remChar = inputStr.substring(0,i) + inputStr.substring(i+1); //bc  c 
			arrangements(remChar,newChar);
		}
		//return retChar;
	}
	//abc 
	public static void main(String[] args) {
		String test = "ABC";
		//System.out.println("Total possible combinations "
		arrangements(test, "");
	}

}
