package com.Practical10a;

public class MessangingApp {
    public static void main(String[] args) {
        sharedbuffer sharedBuffer = new sharedbuffer(5); 
        Producer producer = new Producer(sharedBuffer);
        Consumer consumer = new Consumer(sharedBuffer);
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);
        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Messaging application finished.");
    }
}