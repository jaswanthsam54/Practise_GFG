import java.util.*;

class Solution {
    static List<Integer> extraCount(String s) {
        int n = s.length();
        
        char[] pattern = new char[4]; 
        boolean[] usedChars = new boolean[256]; 
        
        // Step 1: Identify the character for each remainder group
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch != '!') {
                pattern[i % 4] = ch;
                usedChars[ch] = true;
            }
        }
        
        // Step 2: Collect all colors that haven't been used anywhere yet
        Queue<Character> missingColors = new LinkedList<>();
        if (!usedChars['R']) missingColors.add('R');
        if (!usedChars['B']) missingColors.add('B');
        if (!usedChars['Y']) missingColors.add('Y');
        if (!usedChars['G']) missingColors.add('G');
        
        // Assign the genuinely missing colors to the empty remainder groups
        for (int i = 0; i < 4; i++) {
            if (pattern[i] == 0) { 
                pattern[i] = missingColors.poll();
            }
        }
        
        // Step 3: Count the missing '!' slots for each specific color
        int rCount = 0, bCount = 0, yCount = 0, gCount = 0;
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '!') {
                char expectedColor = pattern[i % 4];
                if (expectedColor == 'R') rCount++;
                else if (expectedColor == 'B') bCount++;
                else if (expectedColor == 'Y') yCount++;
                else if (expectedColor == 'G') gCount++;
            }
        }
        
        // Return the final counts in the order EXPECTED BY THE DRIVER: R, B, Y, G
        List<Integer> result = new ArrayList<>();
        result.add(rCount);
        result.add(bCount);
        result.add(yCount);
        result.add(gCount);
        
        return result;
    }
}