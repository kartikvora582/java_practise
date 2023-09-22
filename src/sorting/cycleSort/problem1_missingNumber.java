//package sorting.cycleSort;
////https://leetcode.com/problems/missing-number/
//
////Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
////Input: nums = [3,0,1]
////        Output: 2
////        Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
//public class problem1_missingNumber {
//    public static void main(String[] args) {
//
//    }
//    public int missingNumber(int[] nums) {
//        int i = 0;
//        while (i < nums.length) {
//            int correctIndex = nums[i];
//            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
//                swap(nums, i , correctIndex);
//            } else {
//                i++;
//            }
//        }
//        for (int j = 0; j < nums.length; j++) {
//            if (j != nums[j]) {
//                return j;
//            }
//        }
//        return nums.length;
//    }
//
//    void swap(int[] arr, int first, int second) {
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//
//}



package sorting.cycleSort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/missing-number/

//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
//Input: nums = [3,0,1]
//        Output: 2
//        Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
public class problem1_missingNumber {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        findDisappearedNumbers(arr);
        System.out.println(arr);
    }
    static   List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i , correctIndex);
            } else {
                i++;
            }
        }
        List<Integer> missing = new ArrayList<Integer>();
        for (int j = 0; j < nums.length; j++) {
            if (j != nums[j]) {
                missing.add(j);
            }
        }
        return missing;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}



