package com.Practical10a;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


class sharedbuffer {
    private BlockingQueue<String> buffer;
    public sharedbuffer(int capacity) {
        buffer = new ArrayBlockingQueue<>(capacity);
    }

    public void produce(String message) throws InterruptedException {
        buffer.put(message); 
        System.out.println("Produced: " + message);
    }

    public String consume() throws InterruptedException {
        String message = buffer.take();  
        System.out.println("Consumed: " + message);
        return message;
    }
}