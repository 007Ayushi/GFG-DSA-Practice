class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int n=arr.length;
        int lo=0,hi=n-1;
        int idx=-1;
        
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            
            if(arr[mid]==k){
                idx=mid;
                 hi=mid-1;
                
            }
            else if(arr[mid]<k){
                lo=mid+1;
            }
            else if(arr[mid]>k){
                hi=mid-1;
            }
        }
        return idx;
    }
}