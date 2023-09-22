package binary_search;

public class basic_Binary_search {
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,9,10,18,33,44,66,88,99};
        int aim = 11;
        System.out.println(Binary_search(arr, aim));
    }
    static int Binary_search(int[] array, int target){
        int start = 0;
        int end = array.length -1;

        while (start <= end){
            int mid = start -( (start - end) / 2);
            if (array[mid] == target){
                return array[mid];
            } else if (array[mid] < target) {
                start = mid +1;
            }
            else if (array[mid] > target) {
                end = mid -1;
            }

        }
        return -1;
    }

}
