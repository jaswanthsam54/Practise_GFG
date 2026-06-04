class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        int originalA = a;
        int originalB = b;
        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        int gcd = a;
        int lcm = (originalA / gcd) * originalB; 
        
        return new int[]{lcm, gcd};
    }
}