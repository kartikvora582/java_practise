package RecursionSeries;

import java.util.Arrays;

public class Recursion3PatternBubbleSelectionSort {
    public static void main(String[] args) {
        int[] arreg = {5,3,6,7,2,3,1,8};

//        pattern2(4,0);
//      pattern2(4,0);
//
//        System.out.println(func(4));

        bubbleSort(arreg, arreg.length -1,0);
        System.out.println(Arrays.toString(arreg));

//        System.out.println(Arrays.toString(arreg));
//        selection(arreg, arreg.length, 0,0);
//        System.out.println(Arrays.toString(arreg));
    }

//    to print a revered triangle i.e. from 4 stars to 2 stars if input is 4
    static void pattern1(int row, int column){ //
        if(row == column){
            return;
        }
        for (int i = column; i < row; i++) {
            System.out.print("*");
        }
        System.out.println();
//        System.out.println();
        pattern1(row-1, 0);

    }

    // the below two code are 2 different approaches to solve or make a normal triangle i.e. form input 4, triangle starts form
    // 1* to 4*'s
    static void pattern2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            pattern2(r, c+1);
            System.out.print("*");
        } else {
            pattern2(r-1, 0);
            System.out.println();
        }
    }

    //this is my approach a simpler one
    static void pattern2MyApproach(int row, int column){ //
        if(row == column){
            return;
        }

//        System.out.println();
        pattern2MyApproach(row-1, 0);
        for (int i = column; i < row; i++) {
            System.out.print("*");
        }
        System.out.println();
    }


    // bubble sort
    static void bubbleSort(int[] arr, int arrayLenght, int i){
        if(arrayLenght == 1){
            return;
        }
        if (i < arrayLenght){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        bubbleSort(arr, arrayLenght, i+1);
        }
        else{
            bubbleSort(arr, arrayLenght-1, 0);
        }

}

    static void selection(int[] arr, int r, int c, int max) {   // r = lenght of the array, and c = index of the array 
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                selection(arr, r, c+1, c);
            } else {
                selection(arr, r, c+1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selection(arr, r-1, 0, 0);
        }
    }
}
