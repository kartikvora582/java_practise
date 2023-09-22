package BS_2D_array;


import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50},
        };
        System.out.println(Arrays.toString(search(arr, 15)));

    }
    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length -1; // points at 40 even matrix.length-1 works

        while (row < matrix.length && col >= 0){
            if (matrix[row][col] == target){
                return new int[] {row, col};
            }
            if (matrix[row][col] < target){
                row ++;
            }
            else if  (matrix[row][col] > target){
                col --;
            }
        }
        return new int[]{-1,-1};

    }
}

