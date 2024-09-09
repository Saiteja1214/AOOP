package com.collections;
import java.util.*;
public class Main {

	public static void main(String[] args) {
	        List<String> fruits = new ArrayList<>();
		        fruits.add("Apple");
		        fruits.add("Banana");
		        fruits.add("Mango");
		        fruits.add("Grapes");
		        fruits.add("Blueberry");
                fruits.add("Cranberry");
                fruits.add("Peach");
		        Collections.sort(fruits, (str1, str2) -> str2.compareTo(str1));
		        System.out.println("Sorted list in descending order:");
		        for (String fruit : fruits) {
		            System.out.println(fruit);
		        }	
	}

}
