package binary_search;

public class agnostic_binary_search {
    public static void main(String[] args) {
        int[] arr = {10, 9 ,8,7,6,5,4,3,2,1};
        int aim = 4;
        System.out.println(Agnostic_binary_search(arr, aim));
    }
    static int Agnostic_binary_search(int[] array, int target){
        int start = 0;
        int end = array.length - 1;

        boolean asc_or_des = array[start] < array[end];
//        if true ascending else descending

        while (start <= end){
            int mid = start -( (start - end) / 2);
            if (array[mid] == target){
                return mid;
            }
                if (asc_or_des){
//                    for ascending
                    if (array[mid] < target) {
                    start = mid +1;
                    }
                    else if (array[mid] > target) {
                    end = mid -1;
                    }
                }
                else{
//                    for descending
                    if (array[mid] < target) {
                        end = mid - 1;
                    }
                    else if (array[mid] > target) {
                        start = mid + 1;
                    }
                }


        }
        return -1;
    }
}
