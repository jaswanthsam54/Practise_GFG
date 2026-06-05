import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            sb.append("GFG");
            if (i < n - 1) {
                sb.append(" ");
            }
        }
        
        System.out.print(sb.toString());
    }
}