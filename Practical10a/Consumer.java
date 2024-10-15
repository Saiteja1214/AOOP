package com.Practical10a;

class Consumer implements Runnable {
    private sharedbuffer sharedBuffer;
    public Consumer(sharedbuffer buffer) {
        this.sharedBuffer = buffer;
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                sharedBuffer.consume();
                Thread.sleep(200);  
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}