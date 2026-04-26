class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        
        int n=arr.length;
        int lo=0,hi=n-1;
        int lb=-1;
        
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>=target){
                hi=mid-1;
                lb=mid;
               
            }
            else{
                lo=mid+1;
            }
        }
        
        if(lb==-1)return n;
        return lb;
    }
}
