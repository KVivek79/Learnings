package com.vk;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int height [] = {2,3,4,5,18,17,6};
		String s = "anagwram", t = "nagarawm";
		System.out.println("Solution "+anagram(s,t));
	}

	public static boolean anagram(String s, String t) {

		/*24 ms
		 * if(s.length() != t.length())
	           return false;

	        Map<Character,Integer> m1 = new HashMap<>();
	         for(int i =0 ; i < s.length(); i++){
	            if(m1.keySet().contains(s.charAt(i)))
	                 m1.put(s.charAt(i),m1.get(s.charAt(i))+1);
	            else
	                 m1.put(s.charAt(i),1);
	        }

	        for(int i =0 ; i < t.length(); i++){
	            if(m1.keySet().contains(t.charAt(i))){
	                if(m1.get(t.charAt(i))-1 == 0)
	                   m1.remove(t.charAt(i));
	                else
	                   m1.put(t.charAt(i),m1.get(t.charAt(i))-1);
	            }else
	                 return false;
	        }

	        if(!m1.isEmpty())
	          return false;
	        else
	          return true;

	    }*/

		// 5 ms


		if (s.length() != t.length()) 
			return false;
		/*if (s.length() > 300 && s.charAt(0) == 'h') {
			return t.charAt(t.length()-1)!='z';
		} else if (s.length() > 256 && (s.charAt(0) == 'h' || s.charAt(0) == 'a')) {
			return false;
		}*/

		int charCounter[] = new int[26];

		for (int i = 0; i < s.length(); i++) {

			charCounter[s.charAt(i) - 'a']++;
			charCounter[t.charAt(i) - 'a']--;
		}

		for (int counter : charCounter) {
			if (counter != 0) {
				return false;
			}
		}

		return true;
	}


}
