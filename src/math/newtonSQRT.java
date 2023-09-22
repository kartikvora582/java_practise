package math;

public class newtonSQRT {
    public static void main(String[] args) {
//        System.out.println(nwtsqrt(40));
        System.out.println(normalSqrt(20));
    }
    static double normalSqrt(int num){
        int start = 0;
        int end = num;
        int precision = 3;
        double sqrt = 0.0;
        while (start <= end){
            int mid = (start + end)/2;
            if(mid*mid == num){
                return mid;
            } else if (mid*mid > num) {
                end = mid - 1;
            }else{
                start = mid + 1;
                sqrt = mid;
            }
        }
        double incr = 0.1;
        for (int i = 0; i < precision; i++) {
            while (sqrt * sqrt <= num) {
                sqrt += incr;
            }
            sqrt -= incr;
            incr /= 10;
        }
        return sqrt;
    }

    static double nwtsqrt(double n) {
        double x = n;
        double root;
        while (true) {
            root = 0.5 * (x + (n/x));

            if (Math.abs(root - x) < 0.5) {
                break;
            }

            x = root;
        }
        return root;
    }
}