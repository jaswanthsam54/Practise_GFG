// User function Template for Java
class Solution {
    public static int nextPrime(int n) {
        int candidate = n + 1;
        
        // Loop infinitely until we find the next prime
        while (true) {
            if (isPrime(candidate)) {
                return candidate;
            }
            candidate++;
        }
    }
    
    // Helper method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        
        // Check potential factors up to the square root of num
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}