package com.Stack;

public class Main {
public static void main(String[] args)
{
	Stack<Integer> linkedListStack = new LinkedList<>();
    linkedListStack.push(1);
    linkedListStack.push(2);
    linkedListStack.push(3);
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
