class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int lo=0,hi=arr.length-1;
        int res=arr.length;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            
            if(arr[mid]>=target){
                hi=mid-1;
                res=mid;
            }
            else{
                lo=mid+1;
            }
        }
        return res;
    }
}
