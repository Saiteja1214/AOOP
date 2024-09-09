package com.separateEvenandOdd;
import java.util.*;
import java.util.stream.Collectors;
public class Main {
public static void main(String[] args)
{
	        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,12,14,15,16));
	        List<Integer> doubledEvens = numbers.stream().filter(n -> n % 2 == 0).map(n -> n * 2).collect(Collectors.toList());
	        System.out.println("Doubled Even Numbers: " + doubledEvens);
}
}
