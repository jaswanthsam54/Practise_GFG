import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public ArrayList<Integer> sieve(int n) {
        // Create a boolean array "isPrime[0..n]" and initialize
        // all entries it as true. A value in isPrime[i] will
        // finally be false if i is Not a prime, else true.
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        
        // 0 and 1 are not prime numbers
        if (n >= 0) isPrime[0] = false;
        if (n >= 1) isPrime[1] = false;
        
        // Sieve logic: loop from 2 up to sqrt(n)
        for (int p = 2; p * p <= n; p++) {
            // If isPrime[p] is not changed, then it is a prime
            if (isPrime[p]) {
                // Update all multiples of p greater than or equal to the square of it
                // numbers which are multiple of p and less than p^2 are already marked
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        
        // Collect all prime numbers into the result list
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        
        return primes;
    }
}