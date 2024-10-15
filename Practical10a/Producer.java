package com.Practical10a;

class Producer implements Runnable {
    private sharedbuffer sharedBuffer;

    public Producer(sharedbuffer buffer) {
        this.sharedBuffer = buffer;
    }

    @Override
    public void run() {
        int messageCount = 0;
        try {
            while (messageCount < 10) {
                String message = "Message-" + messageCount;
                sharedBuffer.produce(message);
                messageCount++;
                Thread.sleep(100); 
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

