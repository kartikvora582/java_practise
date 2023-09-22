//questions from
//        https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md



package string_stringBuilder;

public class Pattern {
    public static void main(String[] args) {
        pattern31(5);
    }


//        2.  *
//            **
//            ***
//            ****
//            *****


    static void pattern1(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    //    * * * * *
//        * * * *
//        * * *
//        * *
//        *
    static void pattern2(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


//    5.      *
//            **
//            ***
//            ****
//            *****
//            ****
//            ***
//            **
//            *

    static void pattern5(int n) {
        /////////////////my solution//////////////
//        for (int row = 0; row <= n; row++) {
//            for (int col = 0; col < row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int row = 0; row <= n; row++) {
//            for (int col = 0; col < n-row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        for (int row = 0; row < 2 * n; row++) {   // < 2*n as we are making one less row than twice the input
            int totalColReq = row <= n ? row : 2*n - row; // till row 5 col == to num of row after that the condition eg. on 6th row (10-6) = 4 so 4 col
            for (int col = 0; col < totalColReq; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }



    }


//28.         *
//           * *
//          * * *
//         * * * *
//        * * * * *
//         * * * *
//          * * *
//           * *
//            *
//    if you see very similar to the above sum just at each row there is certain spaces equall to (n - col in row)
    static void pattern28(int n){
        for (int row = 0; row < 2 * n; row++) {   // < 2*n as we are making one less row than twice the input
            int totalColReq = row <= n ? row : 2*n - row;// till row 5 col == to num of row after that the condition eg. on 6th row (10-6) = 4 so 4 col
            for (int i = 0; i < n - totalColReq; i++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColReq; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


//    30.             1
//                  2 1 2
//                3 2 1 2 3
//              4 3 2 1 2 3 4
//            5 4 3 2 1 2 3 4 5
//    here you see no of row = n,
//    in for loop for 1st iteration 1 will be present with ( n - totalColReq) spaces,
//    and in second iteration in LHS we go from iteration number to 1 and on RHS we go from 1 to the iteration num.

    static void pattern30(int n ){
        for (int row = 1; row < n; row++) {
            for (int i = 0; i < n - row; i++) { // for second iteration spaces will be 5-2 = 3 spaces
                System.out.print("  ");
            }
            for (int LHSCOl = row; LHSCOl > 1 ; LHSCOl--) { //e.g. for 3rd iteration it will iterate from 3 to num > 1
                System.out.print(LHSCOl +" ");
            }
            for (int RHSCOl = 1; RHSCOl <= row ; RHSCOl++) { //e.g. for 3rd iteration will iterate from 1 to the 3(i.e. the row'th number)
                System.out.print(RHSCOl +" ");
            }
            System.out.println();

        }
    }


    static void pattern17(int n ){
        for (int row = 1; row < 2*n; row++) {
            int totalColReq = row <= n ? row : 2*n - row;
            for (int i = 0; i < n - totalColReq; i++) { // for second iteration spaces will be 5-2 = 3 spaces
                System.out.print("  ");
            }
            for (int LHSCOl = totalColReq; LHSCOl > 1 ; LHSCOl--) { //e.g. for 3rd iteration it will iterate from 3 to num > 1
                System.out.print(LHSCOl +" ");
            }
            for (int RHSCOl = 1; RHSCOl <= totalColReq ; RHSCOl++) { //e.g. for 3rd iteration will iterate from 1 to the 3(i.e. the row'th number)
                System.out.print(RHSCOl +" ");
            }
            System.out.println();

        }
    }


    static void pattern31(int n){
        for (int row = 0; row < 2*n-1; row++) {

            for (int col = 0; col < 2*n-1; col++) {
                int num = 4;
                System.out.print(num);
            }
            System.out.println();

        }
    }
}

