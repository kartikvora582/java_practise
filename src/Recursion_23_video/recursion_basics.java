package Recursion_23_video;

public class recursion_basics {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }
    static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
