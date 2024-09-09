package com.Stack;

public class LinkedList<T> implements Stack <T>{

	  private static class Node<T> {
	        private T data;
	        private Node<T> next;

	        public Node(T data) {
	            this.data = data;
	        }
	    }
	    private Node<T> top;  
	    @Override
	    public void push(T item) {
	        Node<T> newNode = new Node<>(item);  // Create a new node
	        newNode.next = top;                  // Link it to the current top
	        top = newNode;                       // Update the top reference
	    }
	    @Override
	    public T pop() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Stack is empty");
	        }
	        T item = top.data;   // Get the data from the top node
	        top = top.next;      // Remove the top node
	        return item;
	    }
	    @Override
	    public T peek() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Stack is empty");
	        }
	        return top.data;    // Return the data of the top node
	    }
	    @Override
	    public boolean isEmpty() {
	        return top == null;  // Stack is empty if top is null
	    }

}
