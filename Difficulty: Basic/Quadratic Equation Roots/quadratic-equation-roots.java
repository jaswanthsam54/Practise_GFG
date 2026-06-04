import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> roots = new ArrayList<>();
        
        int temp = (b * b) - (4 * a * c);
        
        if (temp < 0) {
            roots.add(-1);
            return roots;
        }
        
        double sqrtD = Math.sqrt(temp);
        
        double root1 = Math.floor((-b + sqrtD) / (2.0 * a));
        double root2 = Math.floor((-b - sqrtD) / (2.0 * a));
        
        int r1 = (int) root1;
        int r2 = (int) root2;
        
        if (r1 >= r2) {
            roots.add(r1);
            roots.add(r2);
        } else {
            roots.add(r2);
            roots.add(r1);
        }
        
        return roots;
    }
}