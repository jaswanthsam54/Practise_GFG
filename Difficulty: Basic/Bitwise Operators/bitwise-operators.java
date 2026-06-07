//Back-end complete function Template for Java
import java.util.Scanner;

public class Solution {
    public static void solve() {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        // Perform all the operations and print in a single line
        int d = a ^ a;
        int e = c ^ b;
        int f = a & b;
        int g = c | (a ^ a);
        e = ~e;
        
        // Print in a single line separated by space and move cursor to next line
        System.out.println(d + " " + e + " " + f + " " + g);
    
        
    
    }
    
}