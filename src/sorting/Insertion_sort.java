package sorting;

import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr = {5,3,2,4,1};
        System.out.println(Arrays.toString(sorting(arr)));

    }
    static int[] sorting(int[] array){
        for (int i = 0; i <= array.length -2 ; i++) {
//            i is the counter for iteration and will add/move n-2 times
            for (int j = i+1; j > 0 ; j--) {
                //the j pointer points to the next elements just after the sorted part of the array, and compares with previous element until condition
                if(array[j-1] > array[j]){
                    swap(array, j-1, j);
                }else {
                    break;
                }

            }

        }
        return array;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
