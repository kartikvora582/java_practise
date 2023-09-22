package binary_search;

public class Search_In_mountainArray {
    public static void main(String[] args) {
    int[] array = {1,2,3,4,5,3,1};
        System.out.println(findInMountainArray(5, array));
    }
    static int findInMountainArray(int target, int[] mountainArr) {
        int find_peak = findPeak(mountainArr);
        int ans_in_asc = BS_asc(mountainArr, find_peak, target);
        int ans_in_dsc = BS_dsc(mountainArr, find_peak, target);
        if(ans_in_dsc == -1){
            return ans_in_asc;
        }
        else if (ans_in_asc == -1){
            return ans_in_dsc;
        }else {
            return ans_in_asc;
        }
    }
    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }

        return start; // or return end as both are =
    }
    static int BS_asc(int[] array, int endIndex, int target){
        int start = 0;
        int end = endIndex;

        while (start <= end){
            int mid = start -( (start - end) / 2);
            if (array[mid] == target){
                return mid;
            } else if (array[mid] < target) {
                start = mid +1;
            }
            else if (array[mid] > target) {
                end = mid -1;
            }

        }
        return -1;
    }
    static int BS_dsc(int[] array, int startIndex, int target){
        int start = startIndex;
        int end = array.length-1;

        while (start <= end){
            int mid = start -( (start - end) / 2);
            if (array[mid] == target){
                return mid;
            }
                if (array[mid] < target) {
                    end = mid - 1;
                }
                else if (array[mid] > target) {
                    start = mid + 1;
                }

        }
        return -1;
    }
}
