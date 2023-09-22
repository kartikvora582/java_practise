package Recursion_23_video;

public class BinartSearchRecursive {
    public static void main(String[] args) {
        int target = 212;
        int[] arry1 = {2,33,46,53,69,70,80,111,212};
        System.out.println(BSrecursvie(arry1,target,0,arry1.length-1));
    }

    static int BSrecursvie(int[] arr, int target, int start, int end){
        int mid = (start + end)/2;
        if (start > end){
            return -1;
        }
        if(arr[mid] == target){
            return mid;
        }
        if (arr[mid] < target){
          return BSrecursvie(arr,target,mid + 1,end);
        }else {
            return BSrecursvie(arr,target,0,mid-1);

        }
    }
}
