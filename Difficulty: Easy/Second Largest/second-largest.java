class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int l=-1;
        int sl=-1;
        for(int num:arr){
            if(num>l){
                sl=l;
                l=num;
            }
            else if(num<l&&num>sl){
                sl=num;
            }
        }
        return sl;
        
    }
}