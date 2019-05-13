package com.datastructures.com;

public class StackDs {
	/*
	 * in array stack implementation we need array name, array size and top [most of
	 * the operations are on top]
	 */
	static final int MAX = 100; // giving size of an array
	int top; // in stack all operations done only on top because of FILO
	int a[] = new int[MAX]; // maximum size of an array

	boolean isEmpty() {
		return (top < 0);
	}

	StackDs() { // creating a constructor to assign a values.
		top = -1;
	}

	public void push(int x) {
		if (top >= (MAX - 1)) { // top >= length of an array -1
			System.out.println("Stact overflow");
		} else {
			a[++top] = x;
			System.out.println(x + " pushed into index " + top);
		}

	}

	public void pop() {
		if (top < 0) {
			System.out.println("stack is underflow");
		} else {
			int x = a[--top];
			System.out.println(a[x] + " popped out");
		}

	}

	public void printall() {
		while (top > -1) {
			System.out.print(a[top] + " -->");
			top--;
		}
	}

	public static void main(String[] args) {
		StackDs sds = new StackDs();
		sds.push(34);
		sds.push(43);
		sds.push(88);
		sds.push(4);
		sds.push(10);
		sds.pop();
		sds.printall();

	}

}
