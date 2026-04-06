class Solution {
    public static int largest(int[] arr) {
        // code here
        int mn=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            mn=Math.max(arr[i],mn);
        }
        return mn;
    }
}
