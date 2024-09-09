package Practical7b;

import java.util.Comparator;

public class Main {
	 public static void main(String[] args) {
	        PriorityQueue<Integer> intQueue = new PriorityQueue<>(Comparator.naturalOrder());
	        intQueue.enqueue(1);
	        intQueue.enqueue(2);
	        intQueue.enqueue(3);
	        intQueue.enqueue(4);
	        System.out.println("Integer Queue Peek: " + intQueue.peek());   
	        System.out.println("Integer Queue Dequeue: " + intQueue.dequeue());
	        System.out.println("Integer Queue Peek after Dequeue: " + intQueue.peek()); 
	        PriorityQueue<Double> doubleQueue = new PriorityQueue<>(Comparator.naturalOrder());
	        doubleQueue.enqueue(2.2);
	        doubleQueue.enqueue(3.3);
	        doubleQueue.enqueue(4.4);
	        System.out.println("Double Queue Peek: " + doubleQueue.peek());   
	        System.out.println("Double Queue Dequeue: " + doubleQueue.dequeue()); 
	        System.out.println("Double Queue Peek after Dequeue: " + doubleQueue.peek()); 
	        PriorityQueue<String> stringQueue = new PriorityQueue<>(Comparator.naturalOrder());
	        stringQueue.enqueue("Apple");
	        stringQueue.enqueue("Banana");
	        stringQueue.enqueue("Peach");
	        System.out.println("String Queue Peek: " + stringQueue.peek()); 
	        System.out.println("String Queue Dequeue: " + stringQueue.dequeue());
	        System.out.println("String Queue Peek after Dequeue: " + stringQueue.peek());
	    }

}
