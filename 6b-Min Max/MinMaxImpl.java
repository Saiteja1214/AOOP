package MinMax;

class MinMaxImpl<T extends Comparable<T>> implements MinMax<T> {

   
    public T min(T[] array) {
        T minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(minValue) < 0) {
                minValue = array[i];
            }
        }
        return minValue;
    }

   
    public T max(T[] array) {
        T maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(maxValue) > 0) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
}
