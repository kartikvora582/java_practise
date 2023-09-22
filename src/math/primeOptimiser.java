package math;

public class primeOptimiser {
    public static void main(String[] args) {
        int toCheck = 31;
//        System.out.println(isPrime(toCheck));
        for (int i = 2; i <= toCheck; i++) {
            System.out.println(i + " " + isPrime(i));
        }
    }
    static boolean isPrime(int num){
        int c = 2;
        while (c*c <= num){
            if (num % c == 0 ){
                return false;
            }
            c++;
        }
        return true;
    }
}

//now to find out prime numbers in a given range from 0-num
//JUST Put a for loop to run from 2-number and check with the above isPrime condition


