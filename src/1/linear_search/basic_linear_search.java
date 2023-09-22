package linear_search;

public class basic_linear_search {
    public static void main(String[] args) {
        int[] array = {10, 11,12,13,14,15};
       boolean ans = finder(array, 19);
        System.out.println(ans);
    }

    static boolean finder(int[]arr, int target){
        if (arr.length == 0){
            return false;
        }
        for (int index = 0; index < arr.length; index++) {
           if (arr[index] == target){
               return true;
           }
        }
        return false;
    }
}
