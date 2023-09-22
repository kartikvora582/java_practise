package sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4};
        System.out.println(Arrays.toString(sorting(arr)));
    }

    static int[] sorting(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int last_element = array.length - i - 1;
            int maxInBound = findMax(array, 0,last_element);
            swap(array, maxInBound, last_element);
        }
        return array;
    }

    static int findMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}