package Practical7a;

public class Main {
	 public static void main(String[] args) {
	     // Testing the linked list stack with Integer
	     Stack<Integer> linkedListStack = new LinkedListStack<>();
	     linkedListStack.push(10);
	     linkedListStack.push(20);
	     linkedListStack.push(30);
	     System.out.println("LinkedList Stack Peek: " + linkedListStack.peek()); 
	     System.out.println("LinkedList Stack Pop: " + linkedListStack.pop());    
	     System.out.println("LinkedList Stack Peek after Pop: " + linkedListStack.peek());  
	     Stack<String> arrayStack = new ArrayStack<>(5);
	     arrayStack.push("A");
	     arrayStack.push("B");
	     arrayStack.push("C");
	     System.out.println("Array Stack Peek: " + arrayStack.peek());  
	     System.out.println("Array Stack Pop: " + arrayStack.pop());    
	     System.out.println("Array Stack Peek after Pop: " + arrayStack.peek());  
	     System.out.println("Array Stack isEmpty: " + arrayStack.isEmpty());  
	     arrayStack.pop();  
	     arrayStack.pop();  
	     System.out.println("Array Stack isEmpty after popping all: " + arrayStack.isEmpty());
	 }
}
