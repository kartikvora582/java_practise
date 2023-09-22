////https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
////34. Find First and Last Position of Element in Sorted Array
//
////Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
////
////        If target is not found in the array, return [-1, -1].
////
////        You must write an algorithm with O(log n) runtime complexity.
////
////        Example 1:
////
////        Input: nums = [5,7,7,8,8,10], target = 8
////        Output: [3,4]
//
//package binary_search;
//
//public class first_and_last_appearence {
//    public static void main(String[] args) {
//
//    }
//    static int[] searchRange(int[] nums, int target) {
//        int[] ans ={-1, -1};
//        int first_position =
//    }
//    static int search(int[] array, int position, boolean isFirstPosition){
//        int ans = -1;
//        int start = 0;
//        int end = array.length - 1;
//
//        while (start <= end){
//            int mid = start -( (start - end) / 2);
//            if (array[mid] < position) {
//                start = mid +1;
//            }
//            else if (array[mid] > position) {
//                end = mid -1;
//            }
//
//        }
//        return -1;
//    }
//}
