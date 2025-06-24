package com.vk;

public class ReverseString {

	public static void main(String[] args) {
        
		String s = " a good   example  ";
		
		s = reverseWords(s);
		System.out.println(s);
	}
	
	 public static String reverseWords(String s) {
	       s=s.trim();
	      
	       int endPointer= findEndPointer(s,s.length()-1);
	       int startPointer = findStartPointer(s,endPointer); 
	       StringBuilder sb = new StringBuilder();  
	       while(startPointer>0)
	       {
	            sb.append(s,startPointer,endPointer+1);
	            endPointer= findEndPointer(s,startPointer);
	            startPointer = findStartPointer(s,endPointer); 

	       }
	        sb.append(" ");
	        sb.append(s,startPointer,endPointer+1);

	        return sb.toString().trim();

	    }
	
	public static int findEndPointer(String s , int index)
    {
        while(index>0 && s.charAt(index)==' ')
            index--;

        return index;

    }

      public static int findStartPointer(String s , int index)
    {
       while(index>0 && s.charAt(index)!=' ')
        {
            index--;
        }

        return index;
        
    }

}
