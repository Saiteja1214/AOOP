package ArrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
       
        ArrayList<String> fruits = new ArrayList<>();

        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("ArrayList after adding elements: " + fruits);

        fruits.remove(1); 
        System.out.println("ArrayList after removing an element: " + fruits);
        String firstFruit = fruits.get(0);
        System.out.println("Element at index 0: " + firstFruit);
        fruits.set(1, "Orange"); 
        System.out.println("ArrayList after replacing an element: " + fruits);
    }
}
