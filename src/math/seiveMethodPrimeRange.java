package math;
// a better time complexity approach to find all prime numbers in a given range
public class seiveMethodPrimeRange {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];//in this boolean array all the values are false at first
        sieve(n, primes);
    }

    // false in array means number is prime
    static void sieve(int n, boolean[] primes) {
        for (int i = 2; i*i <= n; i++) { // same prime concept to loop through the range from 2-sqrt(rangeEnd)
            if (!primes[i]) { // for all values from 2- sqrt(end) it will make their multiples as true
                for (int j = i*2; j <= n; j+=i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}