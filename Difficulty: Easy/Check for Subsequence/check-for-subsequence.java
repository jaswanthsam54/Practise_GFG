class Solution {
    public boolean isSubSeq(String s1, String s2) {
        // code here
        int i=0;
        int j=0;
        for(j=0;j<s2.length();j++){
            if(i < s1.length() && s1.charAt(i)==s2.charAt(j)){
                i++;
            }
        }
        return i==s1.length();
    }
}