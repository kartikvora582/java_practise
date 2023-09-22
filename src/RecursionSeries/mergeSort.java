package RecursionSeries;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr1 = { 12,5,3,11,9,1,13,8};
        System.out.println(Arrays.toString(mergeSortRecursion(arr1)));
    }

    static int[] mergeSortRecursion(int[] arr){
        if(arr.length <= 1){
            return arr;
        }
        int mid = arr.length/2;

        int[] firstPartOfArray = mergeSortRecursion(Arrays.copyOfRange(arr,0,mid));
        int[] secondPartOfArray = mergeSortRecursion(Arrays.copyOfRange(arr,mid, arr.length));
        return merger(firstPartOfArray, secondPartOfArray);
     }

     static int[] merger(int[] first, int[] second){
        int[] mergedArray = new int[first.length + second.length];

        int pointerFirst = 0;
        int PointerSecond = 0;
        int pointerMerged = 0;

        while ( pointerFirst < first.length && PointerSecond < second.length){
            if(first[pointerFirst] < second[PointerSecond]){
                mergedArray[pointerMerged] = first[pointerFirst];
                pointerFirst++;
                pointerMerged++;
            }else {
                mergedArray[pointerMerged] = second[PointerSecond];
                PointerSecond++;
                pointerMerged++;

            }
        }
        /// as the while condition falls false means one of the array has elements remaining whereas other is emptied
         while(pointerFirst < first.length){
             mergedArray[pointerMerged] = first[pointerFirst];
             pointerFirst++;
             pointerMerged++;
         }
         while(PointerSecond < second.length){
             mergedArray[pointerMerged] = second[PointerSecond];
             PointerSecond++;
             pointerMerged++;
         }
        return mergedArray;

     }
}
