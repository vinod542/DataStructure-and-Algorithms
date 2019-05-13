package com.datastructures.com;

class Node { // need to create a node constructor to insert data

	int data;
	Node next;

	public Node(int value) {
		data = value;
		next = null;
	}

	public void displayNode() {
		System.out.println("item: " + data);
	}
}

public class StackLL {
	Node first = null;

	public void insert(int i) {
		Node newNode = new Node(i);
		newNode.next = first;
		first = newNode;

	}

	public void remove() {
		Node temp;
		temp = first;
		first = first.next;
		System.out.println(temp);

	}

	public void printall() {
		Node current = first;
		while (current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.print(" ");

	}

	public static void main(String[] args) {
		StackLL SLL = new StackLL();
		SLL.insert(10);
		SLL.insert(5);
		SLL.insert(15);
		SLL.insert(1);
		SLL.insert(8);
		SLL.insert(12);
		SLL.insert(112);
		SLL.insert(12);
		SLL.insert(17);
		SLL.printall();
		SLL.remove();
		SLL.printall();
	}

}
