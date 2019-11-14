package com.datastructures.com;

public class BinaryTree {

	class Node {
		int value;
		Node left, right;

		Node(int item) {
			this.value = item;
			left = right = null;
		}
	}

	static // Let's add the starting node of our tree, usually called root
	Node root;

	// insertion of new Node in order to keep the tree sorted
	/*
	 * if the new node's value is lower than the current node's, we go to the left
	 * child. if the new node's value is greater than the current node's, we go to
	 * the right child. when the current node is null, we've reached a leaf node and
	 * we can insert the new node in that position
	 */

	// first create a recursive method to do insertion.

	private Node insertion(Node current, int value) {
		if (current == null) {
			return new Node(value);

		}

		if (value < current.value) {
			current.left = insertion(current.left, value);

		} else if (value > current.value) {
			current.right = insertion(current.right, value);

		} else {
			return current;
		}
		return current;
	}

	// public method that starts the recursion from the root node:
	public void add(int item) {
		root = insertion(root, item);
	}

	public void displayAll(Node root) {
		if (root != null) {

			displayAll(root.left);
			System.out.println("current node " + root.value);
			displayAll(root.right);
		}
	}

	public static void main(String[] args) {
		BinaryTree BT = new BinaryTree();
		BT.add(7);
		BT.add(3);
		BT.add(4);
		BT.add(1);
		BT.add(2);
		BT.add(6);
		BT.displayAll(root);
	}

}
