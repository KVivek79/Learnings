package com.vk;


public class ReverseLinkedList {
	
	 static Node head;
	
	 static class Node {
		 int data;
		 Node next;

		 public Node(int data, Node next) {
			 this.data = data;
			 this.next = next;
		 }	
		 public Node(int data) {
			 this.data = data;
			 this.next = null;
		 }
	 }

	 void printList(Node node)
	 {
		 while (node != null) {
			 System.out.print(node.data + " ");
			 node = node.next;
		 }
	 }


	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node(46);
        list.head.next = new Node(35);
        list.head.next.next = new Node(78);
        list.head.next.next.next = new Node(5);

        System.out.println("Given linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("\nReversed linked list ");
        list.printList(head);
	}


	private Node reverse(Node head2) {
		// TODO Auto-generated method stub
		if(head2 == null || head2.next == null) {
			return head2;
		}
		Node prev = null;
        Node current = head2;
        Node next = null;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
            current = next;
		}
		head2 = prev;
		return head2;
	}

}
