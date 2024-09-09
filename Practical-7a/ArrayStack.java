package com.Stack;

public class ArrayStack<T> implements Stack <T>{
	private T[] stackArray;   // Array to store stack elements
    private int topIndex;     
    public ArrayStack(int size) {
        stackArray = (T[]) new Object[size];  // Create a generic array
        topIndex = -1;                        // Stack is initially empty
    }
    @Override
    public void push(T item) {
        if (topIndex == stackArray.length - 1) {
            throw new IllegalStateException("Stack is full");
        }
        stackArray[++topIndex] = item;  // Increment topIndex and add the item
    }
    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackArray[topIndex--];  // Return the top item and decrement topIndex
    }
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackArray[topIndex];  // Return the item at topIndex
    }
    @Override
    public boolean isEmpty() {
        return topIndex == -1;  // Stack is empty if topIndex is -1
    }
}
