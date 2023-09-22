package sorting;

import java.util.Arrays;

public class bubbleSorting {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(sorting(arr)));;
    }
    static int[] sorting(int[] array){
        boolean swapped;
        for (int i = 0; i < array.length; i++) {
            swapped = false;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                return array;
            }
        }
        return array;
    }
}
