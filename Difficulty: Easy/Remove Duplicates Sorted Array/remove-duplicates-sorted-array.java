class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        int s=0;
        for(int f=1;f<arr.length;f++){
            if(arr[s]!=arr[f]){
                s++;
                arr[s]=arr[f];
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<=s;i++){
            result.add(arr[i]);
        }
        return result;
    }
}
