package linear_search;

public class Linear_search_inRange {
    public static void main(String[] args) {
        int[] array1 = {12,13,25,16,33,44,45,66,78};
        int valueToFound = 33;
        int ans = rangeSeacher(array1,valueToFound,2,4);
        System.out.println(ans);
    }
    static int rangeSeacher(int[] array, int target, int startRange, int endRange){
        for (int i = startRange; i <= endRange ; i++) {
            if(array[i] == target){
                return i;
            }

        }
        return -1;
    }
}
