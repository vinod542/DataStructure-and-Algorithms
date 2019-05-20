package com.amazonArray.com;

public class CircularQueue {
	private static final int Max = 6;
	int rear = -1;
	int front = -1;
	int a[] = new int[Max];

	public void insert(int i) { // time complexity here is O(1)
		if ((front == 0 && rear == Max - 1) || (rear + 1 == front)) {
			System.out.println("Overflow");
		} else {
			if ((rear == -1 && front == -1) || (front == 1 && rear == Max - 1)) {
				rear = 0;
			} else {
				rear++;
			}
			a[rear] = i;
		}
		System.out.println(rear + " " + i);
	}

	public void delete() { // time complexity here is O(1)

		if (front == -1 && rear == -1) {
			System.out.println("underflow");
		} else {

			if (front == rear) {
				front = -1;
				rear = -1;
			} else if (front == Max - 1) {
				front = 0;
			} else {
				front++;
			}
		}

		System.out.println("deleted:" + front + " " + a[front]);
		front ++;
	}

	public void printall() { // time complexity is O(n)
		while (rear >= front) {
			System.out.println(front + " " + a[front]);
			front++;
		}
	}

	public static void main(String[] args) {
		CircularQueue cq = new CircularQueue();
		cq.insert(10);
		cq.insert(44);
		cq.insert(33);
		cq.insert(32);
		cq.insert(101);
		cq.delete();
		cq.printall();

	}

}
