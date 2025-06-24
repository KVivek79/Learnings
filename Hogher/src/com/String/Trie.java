package com.String;

import java.util.Arrays;
import java.util.Locale;

public class Trie {
	
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
	
	public static boolean search(String key) {
		Node currNode = root;
		for(int i=0;i<key.length();i++) {
			
			int index = key.charAt(i) - 'a';
			// Checks if that character is present or not at that index
			if(currNode.childrenNode[index] == null)
				return false;
			// Checks if all the key characters are present but that key is not a word i.e eow=false
			if(i == key.length()-1 && currNode.childrenNode[index].eow==false)
				return false;
			
			currNode = currNode.childrenNode[index];
		}
		return true;
	}
	
	
	// Word break problem - Given an input string and a dictionary of words , find out if the input string
	// can be broken into a space-separated sequence of words.
	public boolean wordBreak(String key) {
		if(key.length() == 0)
			return true;
		
		for(int i=1;i<=key.length();i++) {
			String firstPart = key.substring(0,i);
			String secondPart = key.substring(i);
			//search the first part if true then search for other part
			boolean firstExist = search(firstPart);
			// Use recursion for other part
			if(firstExist && wordBreak(secondPart))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String [] inp = {"the", "animal", "any", "contains", "there","anything"};
		Trie obj = new Trie();
		for(String x : inp)
			obj.insert(x);
		
		System.out.println(search("there"));
		System.out.println(root.toString());
		System.out.println(search("thei"));
		System.out.println(search("th"));
		//Locale defaultLocale = new Locale("zh_sg");
		Locale defaultLocale = Locale.TAIWAN;
		System.out.println(defaultLocale);
		// To Test word break
		String test = "anyanythingcontains";
		System.out.println(obj.wordBreak(test));
	}

}
