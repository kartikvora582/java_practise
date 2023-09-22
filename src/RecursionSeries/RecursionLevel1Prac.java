package RecursionSeries;

import java.util.ArrayList;

public class RecursionLevel1Prac {
    public static void main(String[] args) {
//        fun(5);

//        System.out.println(factorial(5));

//        System.out.println(SumOfDigits(541));

//        System.out.println(ReversalOfNum(1234));

//        int number = 1234;
//        ReversalOfNum(number, (int)(Math.log10(number)) + 1);
//        System.out.println(ans);

        System.out.println(CountZerosInNum(3020400, 0));
    }

    // printing num from 1-n for a given num n through recursion
    static void fun(int n) {
        if (n == 0) {
            return;
        }
        fun(n - 1);
        System.out.println(n);
    }

    //factorial of a number eg 5! = 5*4*3*2*1
    static int factorial(int n) {
        if (n <= 1) {
            return n;
        }
        return n * factorial(n - 1);
    }

// gives sum of digits eg n=123 answer will be 6
    static int SumOfDigits(int n) {
        if (n == 0) {
            return n;
        }
        return (n % 10) + SumOfDigits(n / 10);
    }

    // reversal of number very important concept
    static int ans = 0;
    static void ReversalOfNum(int n, int nLenght) {
        if(n == 0){
            return ;
        }
        int value = n%10;
        int multiplier = (int)Math.pow(10,nLenght - 1);
        ans = ans + (value*multiplier);
        ReversalOfNum(n/10, (int)(Math.log10(n/10)) + 1);
    }

    // palindrome
    static int CountZerosInNum(int n, int count){
        if (n == 0){
            return count;
        }
        if(n % 10 == 0){
            ++count;
        }
        return CountZerosInNum(n/10, count);

    }

}