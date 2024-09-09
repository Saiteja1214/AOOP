package Practical7a;

class ArrayStack<T> implements Stack<T> {
	 private T[] stackArray;   
	 private int topIndex;     
	 public ArrayStack(int size) {
	     stackArray = (T[]) new Object[size]; 
	     topIndex = -1;                        
	 }
	 @Override
	 public void push(T item) {
	     if (topIndex == stackArray.length - 1) {
	         throw new IllegalStateException("Stack is full");
	     }
	     stackArray[++topIndex] = item; 
	 }
	 @Override
	 public T pop() {
	     if (isEmpty()) {
	         throw new IllegalStateException("Stack is empty");
	     }
	     return stackArray[topIndex--];  
	 }
	 
	 @Override
	 public T peek() {
	     if (isEmpty()) {
	         throw new IllegalStateException("Stack is empty");
	     }
	     return stackArray[topIndex];  
	 }

	 @Override
	 public boolean isEmpty() {
	     return topIndex == -1;  
	 }
	}
