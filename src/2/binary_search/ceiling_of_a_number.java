package binary_search;

public class ceiling_of_a_number {
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,9,10,18,33,44,66,88,99};
        int aim = 11;
        System.out.println(Ceiling_binary_search(arr, aim));
    }
    static int Ceiling_binary_search(int[] array, int target){
        int start = 0;
        int end = array.length - 1;

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
        return start;
        //as start on breaking the while condition will always give the ceiling number so we
//        return start
//        if floor of a number is asked(greatest lower bounf) then we return "end"
    }
}
