package MinMax;

public class Main {
    public static void main(String[] args) {
        
        Integer[] intArray = {11, 13, 19, 11, 14};
        MinMax<Integer> intMinMax = new MinMaxImpl<>();
        System.out.println("Integer Array Min: " + intMinMax.min(intArray));
        System.out.println("Integer Array Max: " + intMinMax.max(intArray));

        
        String[] strArray = {"apple", "orange", "banana", "pear"};
        MinMax<String> strMinMax = new MinMaxImpl<>();
        System.out.println("String Array Min: " + strMinMax.min(strArray));
        System.out.println("String Array Max: " + strMinMax.max(strArray));

       
        Character[] charArray = {'y', 'b', 'n', 'q', 'b'};
        MinMax<Character> charMinMax = new MinMaxImpl<>();
        System.out.println("Character Array Min: " + charMinMax.min(charArray));
        System.out.println("Character Array Max: " + charMinMax.max(charArray));

        
        Float[] floatArray = {2.8f, 5.7f, 4.2f, 7.1f};
        MinMax<Float> floatMinMax = new MinMaxImpl<>();
        System.out.println("Float Array Min: " + floatMinMax.min(floatArray));
        System.out.println("Float Array Max: " + floatMinMax.max(floatArray));
    }
}