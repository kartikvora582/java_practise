import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[][] array = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
        int a = array[2][1];
        System.out.println(a);

        for (int row = 0; row < array.length; row++) {
            for(int col = 0; col < array[row].length; col++){
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }


    }

}


