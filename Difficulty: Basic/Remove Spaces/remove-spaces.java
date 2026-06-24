class Solution {
    String removeSpaces(String s) {
        // code here
        char[] arr=new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i);
        }
        int slow=0;
        int fast=0;
        for(fast=0;fast<arr.length;fast++){
            if(arr[fast]!=' '){
                arr[slow]=arr[fast];
                slow++;
            }
        }
        return new String(arr,0,slow);
    }
}