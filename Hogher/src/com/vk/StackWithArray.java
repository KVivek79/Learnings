package com.vk;

public class StackWithArray {
	
	int[] stack;
	int stacksize;
	int topElement;
	
	public StackWithArray(int size) {
		stacksize = size;
		stack = new int[size];
		topElement = -1;
	}
	
	public void push (int value) {
		if(stacksize - 1 == topElement)
		   System.out.println("stack overflow");
		stack[++topElement] = value;
		System.out.println("Element : "+value + " pushed into stack");
	}
	
	public int pop() {
		if(topElement == -1) {
			System.out.println("Empty stack");
			return -1;
		}
		int poppedElement = stack[topElement--];
        System.out.println(poppedElement + " popped from the stack");
		return poppedElement;		
	}
	
	public int peek() {
		if(topElement == -1) {
			System.out.println("Empty stack or stack underflow");
			return -1;
		}
		return stack[topElement];
	}
	
	public boolean isEmpty() {
		return (topElement == -1);
	}

	public static void main(String[] args) {
		StackWithArray stack = new StackWithArray(5); // Creating a stack of size 5

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);

        // Peeking the top element
        System.out.println("Top element of the stack: " + stack.peek());

        // Popping elements from the stack
        stack.pop();
        stack.pop();
        stack.pop(); // Trying to pop from an empty stack

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

	}

}
