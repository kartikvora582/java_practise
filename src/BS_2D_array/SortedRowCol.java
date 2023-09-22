package BS_2D_array;

//https://leetcode.com/problems/search-a-2d-matrix/
//the above leet code problem needs boolean return so during revision do the needfull
import java.util.Arrays;

public class SortedRowCol {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17,18,20,30}
        };
        System.out.println(Arrays.toString(search(arr, 30)));
    }
    static int[]  search(int[][] matrix, int target){
        int start = 0;
        int end = matrix.length-1;

        int[] notFound = {-1,-1};// trademark to return ot to compare not found cases

        while(start < end -1){ // this loop will give us 2 arrays to do binary search on in some cases those 2 array can be same also
            int mid = start -( (start - end) / 2);
            if (matrix[mid][0] == target){
                return new int[] {mid, 0};//when answer is directly found (this will happen if answer is in 0th index)
            }
            if (matrix[mid][0] < target){
                start = mid;
            }
            if (matrix[mid][0] > target){
                end = mid -1;
            }
        }
        //the two arrays breaked down
        int[] arr1 = matrix[start];
        int[] arr2 = matrix[end];

        //case if the two array are same
        if(arr1 == arr2){
            return Binary_search(arr1, target, start);
        }
        // if the two array are not same we would perform BS on both and return the one which does not give {-1,-1} as ans
        else {
            int[] type1 = Binary_search(arr1, target, start);
            int[] type2 = Binary_search(arr2, target, end);

            if(Arrays.equals(type1, notFound)){
                return type2;
            }else {
                return type1;
            }
        }

    }

    //code for BS which returns the position if element is found
    static int[] Binary_search(int[] array, int target, int row){
        int start = 0;
        int end = array.length -1;

        while (start <= end){
            int mid = start -( (start - end) / 2);
            if (array[mid] == target){
                return new int[] {row,mid};
            } else if (array[mid] < target) {
                start = mid +1;
            }
            else if (array[mid] > target) {
                end = mid -1;
            }

        }
        return new int[]{-1,-1};
    }

}
