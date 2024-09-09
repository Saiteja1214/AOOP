package Practical8a;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Creating a list of strings
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Peach");

        // Sorting the list in descending order using a lambda expression
        Collections.sort(fruits, (str1, str2) -> str2.compareTo(str1));

        // Printing the sorted list
        System.out.println("Sorted list in descending order:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

