class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        
        int lo=0,hi=arr.length-1;
        
        int res=arr.length;
        
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            
            if(arr[mid]>target){
                res=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return res;
    }
}
