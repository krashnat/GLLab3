package com.gl.BalanceBracket;

public class Stack<T> {

	T[] arr;
	private int top;
	private int capacity;

	
	@SuppressWarnings("unchecked")
	Stack(int size) {
		arr= (T[]) new Object[size];
		capacity = size;
		top = -1;
	}

	public void push(T x) {
		if (isFull()) {

			System.exit(-1);
		}

		arr[++top] = x;
	}

	public T pop() {

		if (isEmpty()) {

			System.exit(-1);
		}

		return arr[top--];
	}

	public T peek() {
		if (!isEmpty()) {
			return arr[top];
		} else {
			System.exit(-1);
		}
		return null;

		
	}

	public int size() {
		return top + 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == capacity - 1;
	}

}
