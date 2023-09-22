package linear_search;
import java.util.Arrays;
import java.util.Scanner;

public class min_max_linearSearch {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = value.nextInt();

        }
        int minValue = findMin(array);
        System.out.println(minValue);
    }
    static int findMin(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
