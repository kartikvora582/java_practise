package RecursionSeries;

import java.util.ArrayList;

public class Recursion2ArrayProblems {
    public static void main(String[] args) {
        int[] arr = {5,2,3,4,5,6,1,7,5};
        int[] arr2 = {10,8,6,5,4,3,2,1};
//        System.out.println(SortedArrayChecker(arr, 0));

//        System.out.println(LinearSearchRecursion(arr, 0, 1));

//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> ans = occurenceRecursion(arr,5,0,list);
//        System.out.println(ans);

//        System.out.println(occurence2(arr,5,0));
        System.out.println(RBS(arr2,2,0, arr2.length-1));
    }



    // is array is sorted of not
    static boolean SortedArrayChecker(int[] arr, int Arrayindex){
        if (Arrayindex == arr.length -1 ){
            return true;
        }
        if(arr[Arrayindex] <= arr[Arrayindex + 1] & SortedArrayChecker(arr, Arrayindex + 1)){
            return true;
        }
        return false;
    }

    // if an element is present in an array (linear search)
    static boolean LinearSearchRecursion(int[] arr, int arrayIndex, int target){
        if (arrayIndex == arr.length -1 ){
            if(arr[arrayIndex] == target) {
                return true;
            }else {
                return false;
            }
        }
        return (arr[arrayIndex] == target || LinearSearchRecursion(arr, arrayIndex + 1, target));

    }

    //return index's of the occurence of target value in a array

    static ArrayList<Integer> occurenceRecursion(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length) {
                return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return occurenceRecursion(arr,target,index+1,list);

    }

    // counting occurenc without passing an arraylist in the argument
    // or how to count occurence with creating list in the function body

    static ArrayList<Integer> occurence2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ocurrenceFromBelowCalls = occurence2(arr, target, index+1);
        list.addAll(ocurrenceFromBelowCalls);
        return list;
    }

    // rotated binary search through recursion
    static int RBS(int[] arr, int target, int startIndex, int endIndex){
        if(startIndex > endIndex){
            return -1;
        }
        int mid = (startIndex + endIndex)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] > target){
            return RBS(arr, target, mid+1, endIndex);
        }else{
            return RBS(arr, target, startIndex, mid-1);
        }
    }
}

