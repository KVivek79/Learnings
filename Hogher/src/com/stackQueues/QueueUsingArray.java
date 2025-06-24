package com.stackQueues;

import java.util.Arrays;

public class QueueUsingArray {
	
	private int arr [];
	private int start, end, currsize, maxSize;
	
	public QueueUsingArray() {
		arr = new int[20];
		start = -1;
		end = -1;
		currsize = 0;
	}
	
	public QueueUsingArray(int maxSize) {
		this.maxSize = maxSize;
		arr = new int[maxSize];
		start = 0;
		end = 0;
		currsize = 0;
	}
      
	public void push (int newElement) {
		if(currsize == maxSize) {
			System.out.println("Queue is full");
			System.exit(1);
		}
		/*
		 * if(end == -1) { start =0; end =0; }
		 */
		arr[end % maxSize] = newElement;
		System.out.println("Element is added "+newElement);
		end++;
		currsize++;
	}
	
	public int pop() {
		if(currsize <= 0) {
			System.out.println("Queue is empty");
			return -1;
		}
		int removedElement = arr[start % maxSize];
		arr[start % maxSize] = -1;
		System.out.println("Element is removed "+removedElement);
		start++;
		currsize--;
		
		return removedElement;
		
	}
	
	public int top() {
		if(currsize <= 0) {
			System.out.println("Queue is empty");
			return -1;
		}
		System.out.println("Top element "+arr[start%maxSize]);
		return arr[start%maxSize];

	}	
	
	public int size() {
		System.out.println("size of Queue "+currsize);
		return currsize;
	}

	public static void main(String[] args) {
		QueueUsingArray q = new QueueUsingArray(3);
		q.push(1);
		q.push(2);
		q.pop();
		q.push(3);
		q.push(4);
		q.pop(); q.push(5); q.pop(); q.push(6); q.pop(); q.pop(); q.push(7); q.pop(); q.push(8); q.push(9); q.top(); q.size();	
		
		Arrays.stream(q.arr).forEach(System.out::println);
		
	}

}
