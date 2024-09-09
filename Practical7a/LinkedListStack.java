package Practical7a;



class LinkedListStack<T> implements Stack<T> {
	 private static class Node<T> {
	     private T data;
	     private Node<T> next;

	     public Node(T data) {
	         this.data = data;
	     }
	 }
	 private Node<T> top;  
	 public void push(T item) {
	     Node<T> newNode = new Node<>(item);  
	     newNode.next = top;                  
	     top = newNode;                      
	 }

	 @Override
	 public T pop() {
	     if (isEmpty()) {
	         throw new IllegalStateException("Stack is empty");
	     }
	     T item = top.data;  
	     top = top.next;      
	     return item;
	 }
	 @Override
	 public T peek() {
	     if (isEmpty()) {
	         throw new IllegalStateException("Stack is empty");
	     }
	     return top.data;    
	 }
	 @Override
	 public boolean isEmpty() {
	     return top == null;  
	 }
	}