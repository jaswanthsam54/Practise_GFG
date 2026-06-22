class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int maxfreq=-1;
        char ans='a';
        for(int i=0;i<26;i++){
            if(freq[i]>maxfreq){
                maxfreq=freq[i];
                ans=(char)(i+'a');
            }
        }
        return ans;
    }
}