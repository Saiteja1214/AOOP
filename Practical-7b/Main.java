package com.QUEUE;
import java.util.*;
public class Main {
public static void main(String[] args)
	{
        
        PriorityQueue<Integer> intQueue = new PriorityQueue<>(Comparator.naturalOrder());
        intQueue.enqueue(1);
        intQueue.enqueue(2);
        intQueue.enqueue(3);
        intQueue.enqueue(4);
        System.out.println("Integer Queue Peek: " + intQueue.peek());   // Should be 1
        System.out.println("Integer Queue Dequeue: " + intQueue.dequeue()); // Should be 1
        System.out.println("Integer Queue Peek after Dequeue: " + intQueue.peek()); // Should be 5
        PriorityQueue<Double> doubleQueue = new PriorityQueue<>(Comparator.naturalOrder());
        doubleQueue.enqueue(6.8);
        doubleQueue.enqueue(8.2);
        doubleQueue.enqueue(7.3);
        System.out.println("Double Queue Peek: " + doubleQueue.peek());  
        System.out.println("Double Queue Dequeue: " + doubleQueue.dequeue()); 
        System.out.println("Double Queue Peek after Dequeue: " + doubleQueue.peek()); 
        PriorityQueue<String> stringQueue = new PriorityQueue<>(Comparator.naturalOrder());
        stringQueue.enqueue("Apple");
        stringQueue.enqueue("Banana");
        stringQueue.enqueue("Grapes");
        System.out.println("String Queue Peek: " + stringQueue.peek());   // Should be "Apple"
        System.out.println("String Queue Dequeue: " + stringQueue.dequeue()); // Should be "Apple"
        System.out.println("String Queue Peek after Dequeue: " + stringQueue.peek()); // Should be "Banana"
    
	}

}
