class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        
        
        int lo=0,hi=arr.length-1;
        int ub=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            
            if(arr[mid]>target){
                ub=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        if(ub==-1)return arr.length;
        return ub;
    }
}
