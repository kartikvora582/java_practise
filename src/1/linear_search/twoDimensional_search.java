package linear_search;

public class twoDimensional_search {
    public static void main(String[] args) {
        int[][] array2 = {
                {2, 3, 4,5},
                {12,15,13},
                {9,10}
        };
        System.out.println(search2D(array2));
    }
    static int search2D(int[][] arr){
        if(arr.length == 0){
            return -1;
        }
        int max = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
//
//if revising try returning index, min value and other you can think of
//especailly returning index of target
//
//hint return array containing index as [row, col]