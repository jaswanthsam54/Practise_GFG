import java.util.HashMap;
import java.util.Map;

class Solution {
    public static String TieBreak(String arr[]) {
        // Step 1: Count the votes for each candidate
        HashMap<String, Integer> voteCount = new HashMap<>();
        for (String candidate : arr) {
            voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
        }
        
        String winner = "";
        int maxVotes = -1;
        
        // Step 2: Find the candidate with the max votes & handle tie-breakers
        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
            String candidate = entry.getKey();
            int votes = entry.getValue();
            
            if (votes > maxVotes) {
                maxVotes = votes;
                winner = candidate;
            } 
            // Tie-breaker: Same votes, choose lexicographically smaller name
            else if (votes == maxVotes) {
                if (candidate.compareTo(winner) < 0) {
                    winner = candidate;
                }
            }
        }
        
        return winner;
    }
}