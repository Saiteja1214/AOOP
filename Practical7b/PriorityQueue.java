package Practical7b;

import java.util.*;
class PriorityQueue<T> {
    private ArrayList<T> heap;   
    private Comparator<? super T> comparator; 
    public PriorityQueue(Comparator<? super T> comparator) {
        this.heap = new ArrayList<>();
        this.comparator = comparator;
    }
    public void enqueue(T item) {
        heap.add(item);         
        siftUp(heap.size() - 1); 
    }
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Priority Queue is empty");
        }
        T root = heap.get(0); 
        T lastItem = heap.remove(heap.size() - 1); 

        if (!isEmpty()) {
            heap.set(0, lastItem); 
            siftDown(0);           
        }

        return root;
    }
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Priority Queue is empty");
        }
        return heap.get(0); 
    }
    public boolean isEmpty() {
        return heap.isEmpty();
    }
    private void siftUp(int index) {
        int parentIndex = (index - 1) / 2;
        if (index > 0 && comparator.compare(heap.get(index), heap.get(parentIndex)) < 0) {
            swap(index, parentIndex);
            siftUp(parentIndex);
        }
    }
    private void siftDown(int index) {
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;
        int smallest = index;

        if (leftChild < heap.size() && comparator.compare(heap.get(leftChild), heap.get(smallest)) < 0) {
            smallest = leftChild;
        }

        if (rightChild < heap.size() && comparator.compare(heap.get(rightChild), heap.get(smallest)) < 0) {
            smallest = rightChild;
        }

        if (smallest != index) {
            swap(index, smallest);
            siftDown(smallest);
        }
    }
    private void swap(int i, int j) {
        T temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}


