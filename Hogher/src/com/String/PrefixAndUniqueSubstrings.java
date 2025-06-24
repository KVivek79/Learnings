package com.String;

import java.util.Arrays;


public class PrefixAndUniqueSubstrings {
	
	static class Node {
		Node [] childrenNode;  // Array of nodes for a - z => 26 , to include all (A-Z, a-z, 0-9, special characters) it should be 256
		boolean eow;     // end of word
		
		public Node() {
			childrenNode = new Node[26]; // a-z
			eow = false;
			for(int i=0;i<26;i++)
				childrenNode[i] = null;
			
			
		}

		@Override
		public String toString() {
			return "Node [childrenNode=" + Arrays.toString(childrenNode) + ", eow=" + eow + "]";
		}
	}
	
	public  static Node root = new Node();
	
	public void insert(String word) {
		Node currNode = root;
		for(int i=0;i<word.length();i++) {
			//Find index
			int index = word.charAt(i) - 'a';
			//Find childrenNode at index, if not found then insert a new node array
			if(currNode.childrenNode[index] == null) {
				currNode.childrenNode[index] = new Node();
			}
			// If length reached to last character then mark eof as true
			if(word.length()-1 == i)
				currNode.childrenNode[index].eow = true;
			//after every itteration, make next children as the root
			currNode = currNode.childrenNode[index];
		}
	}
	
	//Returns true if there a previously inserted string word that has the prefix prefix, false otherwise.
	
	public static boolean prefixSearch(String key) {
		Node currNode = root;
		for(int i=0;i<key.length();i++) {
			
			int index = key.charAt(i) - 'a';
			// Checks if that character is present or not at that index
			if(currNode.childrenNode[index] == null)
				return false;
			
			currNode = currNode.childrenNode[index];
		}
		return true;
	}
	
	// Problem - count unique substrings
	public static boolean uniqueSubstrings(String word) {
		Node currNode = root;
		for(int i=0;i<word.length();i++) {
			
			int index = key.charAt(i) - 'a';
			// Checks if that character is present or not at that index
			if(currNode.childrenNode[index] == null)
				return false;
			
			currNode = currNode.childrenNode[index];
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String [] words = {"apple", "mango", "litchi", "guava"};
        PrefixAndUniqueSubstrings obj = new PrefixAndUniqueSubstrings();
		for(String x : words)
			obj.insert(x);
		
		System.out.println("Starts with : "+prefixSearch("litck"));
		
		
		//Test for UniqueSubstrings
		
	}

}
