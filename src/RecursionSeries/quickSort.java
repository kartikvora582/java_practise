package RecursionSeries;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr1 = { 12,5,3,11,9,1,13,8};
        quickSort(arr1, 0, arr1.length-1);
        System.out.println(Arrays.toString(arr1));
    }
    static void quickSort(int[] arr, int start, int end){
        if (start >= end) {
            return;
        }
        int startIndex = start;
        int endIndex = end;
        int mid = (startIndex + endIndex)/2;

        int pivot = arr[mid];

        while (startIndex <= endIndex){
            while (arr[startIndex] < pivot){
                startIndex ++;
            }
            while (arr[endIndex] > pivot){
                endIndex--;
            }
            if (startIndex <= endIndex) {
                int temp = arr[startIndex];
                arr[startIndex] = arr[endIndex];
                arr[endIndex] = temp;

                startIndex++;
                endIndex--;
            }
        }
        quickSort(arr,start,mid);
        quickSort(arr,mid+1, end);

    }



}
