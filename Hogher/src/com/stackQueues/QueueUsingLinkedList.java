package com.stackQueues;

import java.util.List;

public class QueueUsingLinkedList {
	
	public class QueueNode{
		int val;
		QueueNode next;
		
		QueueNode(int data){
			val = data;
			next = null;
		}		
	}
	
	QueueNode front = null, last = null;
	int size = 0;
	
	void enqueue(int val) {
		QueueNode temp = new QueueNode(val);
		
		if(front == null) {
			front = temp;
			last = temp;
		}else {
			last.next = temp; 
			last = temp;
		}
		size++;
	}
	
	int dequeue() {
		if(front == null)
			return -1;
		else {
			int popedElement = front.val;
			front = front.next;
			size --;
			return popedElement;
		}
	}
	
	int peek() {
		if(front == null)
			return -1;
		else {
			return front.val;
		}
	}
	
	boolean isEmpty() {
		return (front == null);
	}
	
	public static void main(String[] args) {
		
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		queue.enqueue(3);
		
	}

}
